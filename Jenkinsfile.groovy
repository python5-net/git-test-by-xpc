pipeline{

	agent any
	stages{
		
		stage('flow control'){
		    steps{
			script{
			    if (10==10){
			    println "pass (～￣▽￣)～了"
			    }else{
			    println "failed ε=(´ο｀*)))唉"
			    }
		        }
		    }
		}
	}





}
