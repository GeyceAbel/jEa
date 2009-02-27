@echo off
REM  **********  Aqui se especifica la version , y los paquetes de jtoken que se van a crear ***********
set versio=050067
set version=05.00.67

GOTO JEA
:FIJEA
GOTO FIN

:JEA
@echo off
MD ZIP

del zip\easp%versio%.zip
rename .properties .properties.actual
rename .properties.monta .properties

echo version: %version% > vereasp%versio%.txt

REM *** FICHEROS NO .CLASS ********* HTML,GIF,XML,XSL **************************************************

pkzip25 -add -path zip/easp%versio%.zip   .properties
pkzip25 -add -path zip/easp%versio%.zip   look.properties
pkzip25 -add -path zip/easp%versio%.zip   maefc0108.dll
pkzip25 -add -path zip/easp%versio%.zip   maefc0110.dll
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\scripts\*.vbs
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\vbs\query.vbs
pkzip25 -add -direct zip/easp%versio%.zip   mae\*.class
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\html\*.html
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\html\*.gif
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\html\*.jpg
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\html\*.png
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\images\*.gif
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0207\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0403\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0501\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0502\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0504\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0509\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0600\*.txt
pkzip25 -add -path zip/easp%versio%.zip   mae\easp\ver0601\*.txt



pkzip25 -add -path zip/easp%versio%.zip   query.xls

REM *** ARCHIVO DE CONTROL **********************************************
pkzip25 -add -path zip/easp%versio%.zip    vereasp%versio%.txt
del vereasp%versio%.txt

rename .properties .properties.monta
rename .properties.actual .properties

GOTO FIJEA

:FIN
explorer zip
