pipeline {
    agent any

    environment {
        KATALON_CMD = "C:/Users/ChanYing/Desktop/Katalon_Studio_Engine_Windows_64-9.6.0"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/username/repository.git'
            }
        }
        stage('Run Katalon Test Suite') {
            steps {
                script {
                    def katalonCmd = "${KATALON_CMD} -noSplash -runMode=console -projectPath=\"${WORKSPACE}/cy-katalon-test.prj\" -retry=0 -testSuitePath=\"Test Suites/ipMacListAdd\" -executionProfile=\"default\" -browserType=\"Chrome\""
                    if (isUnix()) {
                        sh katalonCmd
                    } else {
                        bat katalonCmd
                    }
                }
            }
        }
    }
}