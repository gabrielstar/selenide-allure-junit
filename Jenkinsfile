branchSpecificConfig()
node() {

     properties([
            parameters([
                string(defaultValue:"${env.BRANCH_NAME}",description:'Execute test job against given branch',name:'BRANCH'),
                string(defaultValue:"${env.gridURL}",description:'URL of Selenium Grid to Use',name:'GRID_URL'),
            ])
        ])
    def repoURL = 'https://github.com/gabrielstar/selenide-allure-junit.git'
    //def gridURL = 'http://192.168.56.1:4444/wd/hub'


    stage("Prepare Workspace") {
        cleanWs()
        env.WORKSPACE_LOCAL = sh(returnStdout: true, script: 'pwd').trim()
        echo "Workspace set to:" + env.WORKSPACE_LOCAL
    }
    stage('Checkout') {
        git branch: env.BRANCH_NAME, credentialsId: '', url: repoURL
    }
    stage('Execute Tests') {
        withMaven(maven: 'maven35') {
            sh """
					cd ${env.WORKSPACE_LOCAL}
					mvn clean test -Dthreads=2 -Dtest=RegressionTestsSuite,SmokeTestsSuite -Dselenide.remote=${env.gridURL}
				"""
        }
    }
    stage('Site Reports') {
        withMaven(maven: 'maven35') {
            sh """
					cd ${env.WORKSPACE_LOCAL}
					mvn site
				"""
        }
    }
    stage('Allure Reports') {
        withMaven(maven: 'maven35') {
            allure includeProperties: true, jdk: '', results: [[path: 'target/allure-results']]

        }
    }

}
/**
    PIPELINE END
**/
def branchSpecificConfig(){
    env.gridURL = 'http://10.2.0.72:4444/wd/hub'
    if(env.GRID_URL){
        env.gridURL = env.GRID_URL
    }
    if(!env.BRANCH_NAME){
            env.BRANCH_NAME = "master"
        }
}
return this