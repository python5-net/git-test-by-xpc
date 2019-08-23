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
		
		stage('测试切换目录'){
			steps{
				dir('../test/'){
				
				sh('ls -lha ')
				sh('echo 将执行清除当前目录的所有的文件')
				deleteDir()
				sh 'ls -lha'

					}
				sh 'pwd'
				sh("ls -al ${env.WORKSPACE}")
				println '回到了原来工作路径了？吗'
			}
		}
		
		stage('init'){
			steps{
			script{
				json_file="${env.WORKSPACE}/testdata/test_json.json"
				println json_file

				file_contents=readFile json_file
				println file_contents
			}
		}
	}


	}





}
