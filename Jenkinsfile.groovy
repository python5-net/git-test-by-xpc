pipeline {
    agent any  
    stages {

        stage('Build') {
            steps {
                println "Build项目开始了by——xpc" 
            }
     }


        stage('Test') { 
            steps {
                println "Test" 
            }
        }
    

    stage('Deploy') { 
            steps {
                println "Deploy 测试输出env...."
		println "${env.JOB_NAME}/${env.BUILD_NUMBER}"
            }
        }


    }
}
