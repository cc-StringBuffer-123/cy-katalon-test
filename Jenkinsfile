pipeline {
    agent any
    environment {
        KATALON_CMD = 'katalon -noSplash -runMode=console -projectPath="cy-katalon-test.prj" -retry=0 -testSuitePath="Test Suites/ipMacListAdd" -executionProfile="default" -browserType="Chrome"'
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'git@github.com:cc-StringBuffer-123/cy-katalon-test.git', credentialsId: 'ed'
            }
        }
        stage('Install Katalon') {
            steps {
                script {
                    def katalonVersion = '9.5.0'
                    def katalonDir = "/opt/katalonstudio"
                    sh """
                        wget https://github.com/katalon-studio/katalon-studio/releases/download/v${katalonVersion}/Katalon_Studio_Linux_64-${katalonVersion}.tar.gz
                        tar -xvzf Katalon_Studio_Linux_64-${katalonVersion}.tar.gz -C /opt
                        ln -s /opt/Katalon_Studio_Linux_64-${katalonVersion} ${katalonDir}
                    """
                }
            }
        }
        stage('Run Katalon Tests') {
            steps {
                script {
                    sh "${env.KATALON_CMD}"
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '**/Reports/**'
        }
    }
}