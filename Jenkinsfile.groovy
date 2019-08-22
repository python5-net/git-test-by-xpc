pipeline {
    agent any
   environment{
	unit_test = true
	xpc='我是xpc--===---==-=-=-=-=--=-=-=-=-'
   }

    stages {
        
	stage('Example') {
    		steps{
	println 'example is running '
	}
	}

	stage('test'){
	steps{
	println "输出变量xpc $xpc"
	println "输出 $unit_test" 
	}
	
	}

	stage('deploy'){
		steps{
		println "deploy is running "
	}
	}

    }
}
