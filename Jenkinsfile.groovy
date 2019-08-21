Pipeline {
    agent any
    
    stages {
        stage('Example') {
    		steps{
	println 'example is running '
	}
	}
	stage('test'){
		steps{
	println "testis runing "
		}
	}
	
	stage('deploy'){
		steps{
			println "deploy is running "
	}
	}
    }
}
