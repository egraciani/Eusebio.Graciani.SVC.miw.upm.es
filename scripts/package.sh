#echo off
echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
cd $workspace
echo "============ call test.bat ======================================================="
call test.bat
echo "============ mvn package on preproduction ======================================================="
mvn install -Denvironment.type=preproduction
mvn package
echo Fin package