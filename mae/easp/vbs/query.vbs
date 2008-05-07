Dim oExcel
Dim oExcelBook
Dim oExcelSheet

Dim oXml
Dim oXmlRoot

Dim sNomPLantilla
Dim sNomXML
Dim sNomSortida

On Error Resume Next
Set oExcel = CreateObject("Excel.Application")
Set oXml = CreateObject("Microsoft.XMLDOM")

If (Err.Number <> 0) Then
    Report.message "Error al crear Objeto Excel/XML: " & Err.Description
    Report.setOk False
Else
    sNomPlantilla = Report.nombreArchivoPlantilla()
    sNomXML = Report.nombreArchivoXML()
    sNomSortida = Report.nombreArchivoDestino()

    Set oExcelBook = oExcel.Workbooks.Open(sNomPlantilla)
    If (Err.Number <> 0) Then
        Set oExcel = Nothing
        Set oXml = Nothing
        oExcel.Quit
        Report.message "Error al abrir la plantilla Excel: " & Err.Description
        Report.setOk False
    Else
        oXml.Async = False

        If Not oXml.Load(sNomXML) Then
            Report.message "Archivo XML incorrecto: " & oXml.parseError.reason & " Line: " & oXml.parseError.Line
            oExcelBook.Close
            oExcel.Quit
            Set oExcel = Nothing
            Set oXml = Nothing
            Set oExcelBook = Nothing
            Report.setOk False
        Else
            Set oXmlRoot = oXml.documentElement

            sTitulo         = oXmlRoot.selectSingleNode("/datos/titulo").Text

            If Err.Number <> 0 Then
                oExcel.DisplayAlerts = False
                Report.message "Error al leer datos del XML. Error : " & Err.Description
                oExcelBook.Close
                oExcel.Quit
                Set oExcel = Nothing
                Set oXml = Nothing
                Set oExcelBook = Nothing
                Report.setOk False
            Else
                oExcelBook.Names("tituloListado").RefersToRange.Value = sTitulo

                Err.Number = 0
                Set oExcelSheet = oExcelBook.ActiveSheet

                If Err.Number <> 0 Then
                    oExcel.DisplayAlerts = False
                    Report.message "Plantilla [" & sNomPlantilla & "] no válida : " & Err.Description
                    oExcelBook.Close
                    oExcel.Quit
                    Set oExcel = Nothing
                    Set oXml = Nothing
                    Set oExcelBook = Nothing
                    Set oExcelSheet = Nothing
                    Report.setOk False
                Else
                    Set oNombreVariable    = oExcelBook.Names("nombreVariable").RefersToRange
                    Set oValorVariable     = oExcelBook.Names("valorVariable").RefersToRange

                    For Each oPagina in oXml.selectNodes("/datos/variable")
                      oVariable.Select
                      oExcel.Selection.Copy
                      oExcel.Selection.Insert
                      Next

                    oExcelBook.Names("variable").RefersToRange.Delete

                    Set oTituloColumna     = oExcelBook.Names("tituloColumna").RefersToRange

                    columna=oTituloColumna.Column

                    oExcelSheet.Cells(oTituloColumna.Row,columna).Select

					columnas=1
                    For Each oPagina in oXml.selectNodes("/datos/columna")
                      if columna>oTituloColumna.Column Then
                        oTituloColumna.Copy
                        oExcelSheet.Cells(oTituloColumna.Row,columna).Select
                        oExcel.Selection.Insert
                        End If
                      oExcelSheet.Cells(oTituloColumna.Row,columna).Value = oPagina.Text
                      columna = columna + 1
                      columnas = columnas + 1
                      Next

					Redim fecha(columnas)
					columnas = 1
                    For Each oPagina in oXml.selectNodes("/datos/columna")
                    	fecha(columnas)=oPagina.Attributes.getNamedItem("tipo").Text
                        columnas = columnas + 1
                        Next

                     iLineaActual   = oExcelBook.Names("inicioDetalle").RefersToRange.Row
                     columnaInicial = oExcelBook.Names("valorColumna").RefersToRange.Column
                     set oDetalle = oExcelBook.Names("detalle").RefersToRange

                     linea = 0

                     For Each oElemento In oXml.selectNodes("/datos/detalle")
                         oDetalle.Select
                         linea = linea + 1
                         Report.textoProgreso "Guardando línea: " & linea
                         oExcel.Selection.Copy
                         oExcelSheet.Cells(iLineaActual, 1).Select
                         oExcel.Selection.Insert

					     columnas = 1
                         columna = columnaInicial
                         For Each oColumna in oElemento.selectNodes("valor")
                            if columna>columnaInicial then
                              oExcelBook.Names("valorColumna").RefersToRange.Copy
                              oExcelSheet.Cells(iLineaActual, columna).Select
                              oExcel.Selection.Insert
                              End If
                            If oColumna.Text<>"" Then
                            	if fecha(columnas)="DATE" Then
		                            oExcelSheet.Cells(iLineaActual, columna).Value = CDate(oColumna.Text)
		                        else if fecha(columnas)="DOUBLE" Then
			                            oExcelSheet.Cells(iLineaActual, columna).Value = Replace(oColumna.Text,",",".")
			                        Else
	    		                        oExcelSheet.Cells(iLineaActual, columna).Value = oColumna.Text
	            		            End If
	            		        End If
                                    Else
                                      oExcelSheet.Cells(iLineaActual, columna).Value = ""
	            		    End If
                            columna = columna + 1
                            columnas = columnas + 1
                         Next
                         iLineaActual = iLineaActual + oDetalle.Rows.Count
                     Next

                    oDetalle.Delete

                    Set oTotal             = oExcelBook.Names("total").RefersToRange

                    oTotal.Delete

                    columna = oTituloColumna.Column
                    For Each oPagina in oXml.selectNodes("/datos/columna")
                      oExcelSheet.Columns(columna).EntireColumn.AutoFit
                      columna = columna + 1
                      Next

                    Err.Number = 0

                    oExcelSheet.Cells(1, 1).Select
                    oExcel.DisplayAlerts = False
                    oExcelBook.SaveAs (sNomSortida)
                    If Err.Number <> 0 Then
                        oExcel.DisplayAlerts = False
                        Report.message "Error al guardar el fichero de salida [" & sNomSortida & "] Error : " & Err.Description
                        oExcelBook.Close
                        oExcel.Quit
                        Set oExcel = Nothing
                        Set oXml = Nothing
                        Set oExcelBook = Nothing
                        Set oExcelSheet = Nothing
                        Report.setOk False
                    Else
                        oExcelBook.Close
                        oExcel.Quit
                        Set oExcelBook = Nothing
                        Set oExcelSheet = Nothing
                        Set oExcel = Nothing
                        Set oXml = Nothing
                    End If
                End If
            End If
        End If
    End If
End If
