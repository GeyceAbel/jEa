On Error Resume Next

strServer=Report.getServidor()
strUsr=Report.getUser()
strPwd=Report.getPassword()
strBD=Report.getBD()
strBDAccess=Report.getBDOrigen()

bOk = true
Set DMOServer = CreateObject("SQLDMO.SQLServer")
If DMOServer is Nothing then
	Report.setError (Report.getERR_SQL_NO_INSTALADO())
Else
	DMOServer.LoginSecure = False
	DMOServer.Connect strServer, strUsr,strPwd
    if (Err.number<>0) then
		Report.setError (Report.getERR_CONECTAR_SQLSERVER())
		Report.setError (Report.getERR_DESCONOCIDO())
		Report.setDescError (Err.description)
		bOk = false
	End if
	if (bOk) then
		For K=1 to DMOServer.Databases.Count
			If UCase(DMOServer.Databases(K).name) = UCase(strBD) then
				Report.setError (Report.getERR_DB_EXISTE())
				bOk = false
				Exit For
			End If
		Next
	end if
	if (bOk) then
		Set cnnAccess = CreateObject("ADODB.Connection")
		cnnAccess.ConnectionString ="Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & strBDAccess
		cnnAccess.Open
       	if (Err.number<>0) then
			Report.setError (Report.getERR_BD_ACCESS_NO_EXISTE())
			Report.setDescError (Err.description)
			bOk = false
		else
			strSQL= "CREATE DATABASE " & strBD & " COLLATE Modern_Spanish_CI_AI "
			DMOServer.Executeimmediate strSQL
       		if (Err.number<>0) then
				Report.setError (Report.getERR_DESCONOCIDO())
				Report.setDescError (Err.description)
				bOk = false
			End if
		end if
		if (bOk) then
			Set cnnSQL = CreateObject("ADODB.Connection")
			cnnSQL.Open "Provider=SQLOLEDB;Data Source="&strServer&";Initial Catalog=" & strBD & ";User ID="&strUsr&";Password="&strPwd
			Set catAccess = CreateObject("ADOX.Catalog")
			Set tblAccess =  CreateObject("ADOX.Table")
			catAccess.ActiveConnection= cnnAccess
			iNumPasos = catAccess.Tables.Count
			iNumTaula = 0
			For K=0 to catAccess.Tables.Count -1
				iNumTaula = iNumTaula + 1
				strTabla=catAccess.Tables(K).Name
				sPBF = "Traspasando Tabla [" & iNumTaula & "/" & iNumPasos & "] " & strTabla
				Report.setMessagePBF sPBF,iNumPasos,true
				If ((catAccess.Tables(K).Type="TABLE") and (Len(catAccess.Tables(K).Name)<=15) and (bOk))  then
					'sPBF = sPBF & strTabla
					'Report.setMessagePBF sPBF,iNumPasos,false
					Set tblAccess= catAccess(strTabla)
					Report.resetPBF2
					' CREATE TABLE
					strSQL= "CREATE TABLE " & strBD & ".dbo.[" & strTabla  & "] ("

					For JJ=1 to  tblAccess.Columns.Count
						Set rstList = cnnAccess.OpenSchema(4 ,Array(Empty,Empty,strTabla))
						bExit = false
						While (Not rstList.EOF) and (not bExit)
							strNameORD = rstList("COLUMN_NAME")
							strPostORD = rstList("ORDINAL_POSITION")
							if (JJ = cInt(strPostORD)) then
								bExit = true
							end if
							rstList.MoveNext
						wend
						rstList.close
						if (bOk) then
							Set fldAccess=catAccess.Tables(K).Columns(strNameORD)
							Select Case fldAccess.Type
								Case 2		'Entero
										strSQL=strSQL & fldAccess.Name & " smallint "
								Case 3		'Entero Largo
										strSQL=strSQL & fldAccess.Name & " int "
								Case 5		'Doble
										strSQL=strSQL & fldAccess.Name & " float "
								Case 202  	'Texto
										strSQL= strSQL & fldAccess.Name &  " varchar(" & fldAccess.DefinedSize & ") "
								Case 130  	'Texto
										strSQL= strSQL & fldAccess.Name &  " varchar(" & fldAccess.DefinedSize & ") "
								Case 203  	'Blob
                                                                                strSQL= strSQL & fldAccess.Name &  " varchar(4000) "
								Case 204  	'Binario
										strSQL= strSQL & fldAccess.Name &  " binary "
								Case 7      'Date
										strSQL= strSQL & fldAccess.Name &  " datetime "
								Case else
										Report.setError (Report.getERR_DESCONOCIDO())
										Report.setDescError (strTabla & "." & fldAccess.Name & "." & catAccess.Tables(K).Columns(KK).Type & " Tipo Datos desconocido.")
										bOk = false
							End Select
							' NOT NULL
							if (not catAccess.Tables(K).Columns(strNameORD).Properties(3).Value) then
								strSQL = strSQL & " NOT NULL "
							End if
        					strSQL= strSQL & ", "
        				End if
					Next
					if (bOk) then
						strSQL=Left(strSQL, Len(strSQL)-2)
						Err.number = 0
						'Primary Key
						strPrimary = ""
						for H=0 to catAccess.Tables(K).Indexes(0).Columns.Count -1
								if (catAccess.Tables(K).Indexes(0).PrimaryKey) then
									strPrimary = strPrimary & catAccess.Tables(K).Indexes(0).Columns(H).Name & ", "
								end if
						Next
						if (Err.number <>0) then strPrimary=""
						Err.number = 0
						if ( not strPrimary = "") then
							strSQL= strSQL & ", PRIMARY KEY (" & Left(strPrimary, Len(strPrimary)-2) & ") "
						End if
						strSQL=strSQL & ")"
       					DMOServer.Executeimmediate strSQL
       					if (Err.number<>0) then
							Report.setError (Report.getERR_DESCONOCIDO())
							Report.setDescError (Err.description)
							bOk = false
						End if

						'Contingut de les taules
						if (bOk) then
							Set rstAccess = CreateObject("ADODB.Recordset")
							rstAccess.Open "[" & strTabla & "]", cnnAccess ,1,2
							Set rstSQL = CreateObject("ADODB.Recordset")
							rstSQL.Open "[" & strTabla & "]", cnnSQL, ,2
       						if (Err.number<>0) then
								Report.setError (Report.getERR_DESCONOCIDO())
								Report.setDescError (Err.description)
								bOk = false
							End if
						end if
						iCountTotal = rstAccess.RecordCount
						Report.setTotalPBF2 iCountTotal
						'iAugment = Cint(iCountTotal/10)
						'i = iAugment
						while (not rstAccess.EOF and bOk)
							'Report.nada
							'i = i + 1
							'if (i >= iAugment) then
								Report.incPBF2
							'	i = 0
							'end if
							rstSQL.AddNew
							For KK= 0 to rstAccess.Fields.Count -1
                                                                if rstAccess.Fields(KK).Type = 7 then
                                                                   if ( IsNull(rstAccess.Fields(KK).Value) ) then
                                                                     rstSQL(rstAccess.Fields(KK).Name).Value = rstAccess.Fields(KK).Value
                                                                   else
                                                        'Report.xiv("0001 ["&rstAccess.Fields(KK).Name&"]  ["&rstAccess.Fields(KK).Value&"] "&Err.number &" "&Err.description)
                                                                      if year(cdate(rstAccess.Fields(KK).Value)) > 1800 then
                                                                        rstSQL(rstAccess.Fields(KK).Name).Value = rstAccess.Fields(KK).Value
                                                                      else
                                                                        rstSQL(rstAccess.Fields(KK).Name).Value = null
                                                                      end if
                                                                   end if
                                                                else
                                                        'Report.xiv("0005 ["&rstAccess.Fields(KK).Name&"]  ["&rstAccess.Fields(KK).Value&"] "&Err.number &" "&Err.description)
                                                                  rstSQL(rstAccess.Fields(KK).Name).Value = rstAccess.Fields(KK).Value
                                                                end if
							next
							rstSQL.Update
                                                        if (Err.number<>0) then
                                                            Report.setError (strTabla + ": "+Report.getERR_DESCONOCIDO())
								Report.setDescError (Err.description)
								bOk = false
							End if
							rstAccess.MoveNext
						wend
						if (not rstAccess is Nothing) then
							rstAccess.Close
							set rstAccess = nothing
						end if
						if (not rstSQL is Nothing) then
							rstSQL.Close
							set rstSQL = nothing
						end if
					end if
				End If
			Next

			'FOREIGN KEYS
			if (bOk) then
				Report.setMessagePBF "Traspasando FOREIGN KEYS ...",iNumPasos,false
				Report.resetPBF2
				For K=0 to catAccess.Tables.Count -1
					Report.setStatePBF2 catAccess.Tables.Count
					If catAccess.Tables(K).Type="TABLE" and bOk then
						sTaula = catAccess.Tables(K).Name
						Report.setMessagePBF "Traspasando FOREIGN KEYS "&sTaula&" ... "
						for J=0 to catAccess.Tables(K).Keys.Count -1
							if (bOk) then
								if (catAccess.Tables(K).Keys(J).Type = 2) then 'Foreign Keys
									sCols = ""
									sColsf = ""
									for d=0 to catAccess.Tables(K).Keys(J).Columns.Count -1
										sCols = sCols & catAccess.Tables(K).Keys(J).Columns(d).Name & ","
										sColsf = sColsf & catAccess.Tables(K).Keys(J).Columns(d).RelatedColumn & ","
									next
									sCols=Left(sCols, Len(sCols)-1)
									sColsf=Left(sColsf, Len(sColsf)-1)
									sSQLAlter = "ALTER TABLE [" & catAccess.Tables(K).Name &"]"
									sSQLAlter = sSQLAlter & " ADD FOREIGN KEY (" & sCols & ")"
									sSQLAlter = sSQLAlter & " REFERENCES [" & catAccess.Tables(K).Keys(J).RelatedTable & "] (" & sColsf & ")"
									cnnSQL.Execute sSQLAlter
       								if (Err.number<>0) then
										Report.setError (Report.getERR_DESCONOCIDO())
										Report.setDescError (Err.description+". Problemas al ejecutar: " + sSQLAlter)
										bOk = false
										'Report.xiv sSQLAlter
										'Err.Clear
									End if
								end if
							end if
						next
					end if
				next
			end if
			if ( not rstAccess is nothing) then rstAccess.Close()
			if ( not cnnAccess is nothing) then cnnAccess.Close()
			if ( not rstSQL is nothing) then rstSQL.Close()
			if ( not cnnSQL is nothing) then cnnSQL.Close()
		end if
	end if
end if
Set rstAccess = Nothing
Set catAccess = Nothing
Set fldAccess = Nothing
Set keyAccess = Nothing
Set connAccess = Nothing
Set connSQL = Nothing
if (not (DMOServer is nothing)) then
	DMOServer.Close
end if
Set DMOServer = Nothing


