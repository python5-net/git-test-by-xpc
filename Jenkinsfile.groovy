Pipeline{


	agent any

	environment{
		unit_test=true
	}

	stages{

		stage('Example_xpc'){
			steps{
				if (unit_test == true){
					println "这是如果单元测试为true输出的语句"
					sh 'll -lha'
					println "上面输出了所在目录的所有文件和详细的说明"

				}
			}
		}
	}



}
