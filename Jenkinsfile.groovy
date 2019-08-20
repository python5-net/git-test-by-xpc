pipeline {
    agent any
    //{
//	label 'xxx-agent-机器FirstPipeLine项目测试'
//	customWorkspace "${env.JOB_NAME}/${env.BUILD_NUMBER}"
  //  }  


    stages {

        stage('Build') {
            steps {
                println "Build项目开始了by——xpc,下面开始执行shell的命令语句"
		sh "pwd" 
		println "打印出了当前所在的目录路径"
			
            }
     }


        stage('Test') { 
            steps {
                println "Test" 
            	sh "ls -lha "
		println "上面已经打印出来了"
	    }
        }
    

    stage('Deploy') { 
            steps {
                println "Deploy 测试输出env.... 下面将没有输出语句 应该直接是succed等语句"
		// println "${env.JOB_NAME}/${env.BUILD_NUMBER}"
            }
        }


    }
}
