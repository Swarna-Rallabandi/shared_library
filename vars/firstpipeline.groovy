import comp.i27academy.builds.Calculator

def call(Map pipelineParams){
Calculator calculator = new Calculator(this)

pipeline {
    agent {
        label 'slave1'
    }
    environment {
        APPLICATION_NAME = "${pipelineParams.appName}"
    }
    stages {
        stage ('Addition') {
            steps {
                script {
                    echo "calling add method"
               println calculator.add(2,3)
            }
                }

        }
        
        stage ('Build') {
              steps{
                echo "buildig the ${env.APPLICATION_NAME} applicationa"
            }
        }
        
        stage ('sonar') {
              steps{
                echo "sonar scans the ${env.APPLICATION_NAME} applicationa"
            }
        }
        
        
        stage ('Test'){
            steps {
                echo "testing the ${env.APPLICATION_NAME} application"
            }
        }
        stage ('Deploy to dev'){
            steps {
                    echo "dev ${env.APPLICATION_NAME} deploy"
            }
       
    }
}

}
}