@echo off
if "%1" == "" goto misatge
if "%2" == "" goto misatge
if "%3" == "" goto misatge
set versio=%1%2%3
md e:\Backup\jEa
del e:\Backup\jEa\copia_jEa_%versio%.zip

pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.html
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.jpg
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.gif
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.xml
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.xsl
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.xls
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.vbs
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.bat
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.properties
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.dll
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.create
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.alter
pkzip25 -add -direct  e:\Backup\jEa\copia_jEa_%versio%.zip e:\Projectes\jEa\*.java

copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\jedicase.mdb e:\Backup\jEa
copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\*.sql e:\Backup\jEa
copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\*.bat e:\Backup\jEa

pkzip25 -add   e:\Backup\jEa\copia_jEa_%versio%.zip e:\backup\jEa\jedicase.mdb
pkzip25 -add   e:\Backup\jEa\copia_jEa_%versio%.zip e:\backup\jEa\*.sql
pkzip25 -add   e:\Backup\jEa\copia_jEa_%versio%.zip e:\backup\jEa\*.bat

del e:\backup\jEa\jedicase.mdb
del e:\backup\jEa\*.sql
del e:\backup\jEa\*.bat
copy e:\Backup\jEa\copia_jEa_%versio%.zip \\geyce-srv01\amesp\copies\jordi\jEa\copia_jEa_%versio%.zip

goto final
:misatge
cls
echo cal indicar la data. Exemple: creaBUP 15 02 05 (15 febrer 2005)
:final

