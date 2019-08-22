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
	
	println "hello test..."

	}

	stage('deploy'){
		steps{
		println "deploy is running "
	}
	}

    }
}
