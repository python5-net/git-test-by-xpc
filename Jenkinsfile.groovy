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
	println "(ー`´ー)"
	}

	}

	stage('deploy'){
		steps{
		println "deploy is running "
	}
	}

    }
}
