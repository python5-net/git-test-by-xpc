pipeline {
    agent any
   environment{
	unit_test = true
   }

    stages {
        stage('Example') {
    		steps{
	println 'example is running '
	}
	}
	stage('test'){
		steps{
	println "testis runing "
	println "判断为true的语句再次执行成功，下面开始测试执行ssh语句"
	sh "ll -lha"
		}
	}
	
	stage('deploy'){
		steps{
			println "deploy is running "
	}
	}
    }
}
