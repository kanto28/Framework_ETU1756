javac -d . *.java
jar cf framework.jar framework/
@echo off
setlocal
rem Vérifier si le fichier framework.jar existe dans la destination
if exist "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\lib\framework.jar" (
    rem Supprimer le fichier existant
    del "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\lib\framework.jar"
)
copy "framework.jar" "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\lib"

if exist "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\web.xml" (
    rem Supprimer le fichier existant
    del "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\web.xml"
)
copy "E:\Study\L2\S4\M_Naina\sprint11\test_framework\web.xml" "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF"

rem Vérifier si le répertoire test_framework existe dans la destination
if exist "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\classes\test_framework" (
    rem Supprimer le répertoire existant
    rmdir /s /q "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\classes\test_framework"
)
rem Copier le répertoire test_framework depuis le répertoire courant vers la destination
xcopy /E /I /Y "test_framework" "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\classes\test_framework"
if exist "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\WEB-INF\classes\test_framework\web.xml" (
    del "E:\Study\logiciel\Tomcat\apache-tomcat-8.5.90\webapps\sprint_web\WEB-INF\WEB-INF\classes\test_framework\web.xml"
)
endlocal
