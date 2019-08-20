pipeline {
    agent none  
    stages {
        stage('Build') {
	    agent{ 
		label '测试节点名称'
	    }
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
                println "Deploy" 
            }
        }
    }
}
