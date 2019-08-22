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
	
	if(unit_test==true){
	echo 'true is running'
	}else{ echo 'false is running'}
	

	}

	stage('deploy'){
		steps{
		println "deploy is running "
	}
	}

    }
}
