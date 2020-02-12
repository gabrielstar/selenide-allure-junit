# Selenide boilerplate example with following integrations working out of the box:

- Allure 1.5 reports
- Parallel tests execution with JUNIT JVM Fork
- Jenkins integration via Jenkinsfile pipeline script
- Local grid supplied in /grid directory
- Example runners in project root eg. /run_parallel.bat
- Environment properties that can be placed in /resources
- Pretty parametrized tests with junitparams

## To run you can call mvn ... or maven wrapper mvnw ...

* run all tests `mvn clean test` 
* run site reports `mvn site`
* run allure reports `mvnw site jetty:run`
* execute tests in parallel `mvnw clean test -Dthreads=2 -Dtest=RegressionTestsSuite,SmokeTestsSuite`
* using per environment properties `mvnw clean test -Denv=test`
* run parallel on grid `mvnw clean test -Dthreads=3 -Dtest=RegressionTestsSuite,SmokeTestsSuite -Dselenide.remote=http://localhost:4444/wd/hub`

## For Jenkins example.

1. Click New Item -> Pipeline
2. In Pipeline choose Pipeline script from SCM
3. Choose SCM:git, Repository URL: https://github.com/gabrielstar/selenide-allure1-junit4-parallelJVM-JenkinsPipelines-Grid.git, branch: */master
4. Save && Build Now

