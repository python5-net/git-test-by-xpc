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
				sh("cd ../test/")
				sh('ls -lah ')
				sh('pwd')
				}
				}		
		}
		
//		stage('测试ssh远程操作command'){
//			steps{
//				sh('ssh 10.1.1.6 " mkdir 10116-file;echo 远程创建了一个文件;ls -lha > xpc.txt"')
//				
//			}
//		}
		



	}



}
