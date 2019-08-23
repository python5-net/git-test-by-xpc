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
		
		stage('查看dir和路径相关'){
			steps{
			script{
				sh("ls -al ${env.WORKSPACE}")
				sh("echo 输出当前的文件路径 ")
				}
				}		
		}
	}





}
