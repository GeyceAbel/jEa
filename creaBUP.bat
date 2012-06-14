@echo off
if "%1" == "" goto misatge
if "%2" == "" goto misatge
if "%3" == "" goto misatge
set versio=%1%2%3
md c:\Backup\jEa
del c:\Backup\jEa\copia_jEa_%versio%.zip

pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.html
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.jpg
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.gif
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.xml
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.xsl
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.xls
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.vbs
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.bat
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.properties
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.dll
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.create
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.alter
pkzip25 -add -direct  c:\Backup\jEa\copia_jEa_%versio%.zip C:\Projectes\jEa\*.java

copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\jedicase.mdb c:\Backup\jEa
copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\*.sql c:\Backup\jEa
copy \\geyce-srv01\amesp\Projectes\Easp\Ver-4.9\Desenvolupament\*.bat c:\Backup\jEa

pkzip25 -add   c:\Backup\jEa\copia_jEa_%versio%.zip c:\backup\jEa\jedicase.mdb
pkzip25 -add   c:\Backup\jEa\copia_jEa_%versio%.zip c:\backup\jEa\*.sql
pkzip25 -add   c:\Backup\jEa\copia_jEa_%versio%.zip c:\backup\jEa\*.bat

del c:\backup\jEa\jedicase.mdb
del c:\backup\jEa\*.sql
del c:\backup\jEa\*.bat
copy c:\Backup\jEa\copia_jEa_%versio%.zip \\geyce-srv01\amesp\copies\jordi\jEa\copia_jEa_%versio%.zip

goto final
:misatge
cls
echo cal indicar la data. Exemple: creaBUP 15 02 05 (15 febrer 2005)
:final

