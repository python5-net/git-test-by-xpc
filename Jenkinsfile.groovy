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
	if (unit_test==true){
		println "hello if。。。"
	}

	}

	stage('deploy'){
		steps{
		println "deploy is running "
	}
	}

    }
}
