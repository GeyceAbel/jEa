On Error Resume Next

strServer=Report.getServidor()
strUsr=Report.getUser()
strPwd=Report.getPassword()
strBDtmp=Report.getBDtmp()
strBDAccess=Report.getBDOrigen()

bOk = true
Set DMOServer = CreateObject("SQLDMO.SQLServer")       
If DMOServer is Nothing then                      
	Report.setError (Report.getERR_SQL_NO_INSTALADO())                                                                 
Else 
	DMOServer.LoginSecure = True
	DMOServer.Connect strServer, strUsr,strPwd
    if (Err.number<>0) then
		Report.setError (Report.getERR_CONECTAR_SQLSERVER())
		bOk = false                                                                                                
	End if
	if (bOk) then
		if (bOk) then                                                                                              				
			Set cnnA = CreateObject("ADODB.Connection")
			cnnA.ConnectionString ="Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & strBDAccess
			cnnA.Open
			
			Set cnnS = CreateObject("ADODB.Connection")						
			cnnS.Open "Provider=SQLOLEDB;Data Source="&strServer&";Initial Catalog=" & strBDtmp & ";User ID="&strUsr&";Password="&strPwd							
			Set catA = CreateObject("ADOX.Catalog")
			Set tblA =  CreateObject("ADOX.Table")
			catA.ActiveConnection= cnnA
			Set catS = CreateObject("ADOX.Catalog")
			Set tblS =  CreateObject("ADOX.Table")
			catS.ActiveConnection= cnnS
       		if (Err.number<>0) then
				Report.setError (Report.getERR_DESCONOCIDO())
				Report.setDescError (Err.description)                                                            
				bOk = false                                                                                                
			End if
			if (bOk) then			
				'Mirarem que el numero de camps i el nom dels camps que hi han a origen i a desti siguin el mateix			
				Report.resetPBF				
				For i=0 to catA.Tables.Count -1
					If ((catA.Tables(i).Type="TABLE") and (Len(catA.Tables(i).Name)<=15) and (bOk))  then										
						sNomTaula = catA.Tables(i).Name
						Report.setMessagePBF "Verificando [" & sNomTaula & "] BD Origen con BD Destino ...",catA.Tables.Count,true	
						iNumColtmp = catA.Tables(sNomTaula).Columns.Count							
						iNumCol    = catS.Tables(sNomTaula).Columns.Count						
       					if (Err.number<>0) then
							Report.setError (Report.getERR_DESCONOCIDO())
							Report.setDescError (Err.description+" [" + sNomTaula + "]")                                                            
							bOk = false                                                                                                
						End if								
						if (bOk) then
							if (iNumColtmp <> iNumCol) then
								Report.setError (Report.getERR_DESCONOCIDO())
								Report.setDescError ("No coincide el numero de campos en tabla " + sNomTaula)
								bOk = false
							else
								Report.resetPBF2
								for j=0 to catA.Tables(sNomTaula).Columns.Count -1
									if (bOk) then										
										sNomCol = catA.Tables(sNomTaula).Columns(j).Name
										bTrobat = false
										for k=0 to catS.Tables(sNomTaula).Columns.Count - 1
											sNomCol2 = catS.Tables(sNomTaula).Columns(k).Name
											if (UCase(sNomCol) = UCase(sNomCol2)) then bTrobat = true
										next
       									if (Err.number<>0) or (not bTrobat) then
											Report.setError (Report.getERR_DESCONOCIDO())
											Report.setDescError ("No se encuentra la columna " + sNomTaula +"."+sNomCol+" en la BD destino")
											bOk = false                                                                                                
										End if																		
									end if
								next
							end if
						end if
					End if
				Next
			end if
			if ( not cnnS is nothing) then cnnS.Close()
			if ( not cnnA is nothing) then cnnA.Close()						
		end if
	end if
end if
Set catA  = Nothing
Set catS  = Nothing
Set connA = Nothing
Set connS = Nothing

if (not (DMOServer is nothing)) then DMOServer.Disconnect
Set DMOServer = Nothing


