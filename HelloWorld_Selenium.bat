cd \
cd STS_Workplace\DemoSelenium
call mvn clean
call mvn install -DskipTests=true
call copy D:\STS_Workplace\DemoSelenium\target\DemoProjectJar-jar-with-dependencies.jar D:\STS_Workplace\DemoSelenium /Y
call java -jar DemoProjectJar-jar-with-dependencies.jar testng.xml