pipeline {
    agent any
   environment{
	unit_test = false
	xpc='我是xpc--===---==-=-=-=-=--=-=-=-=-'
   }
  //  parameters{
 //	string(name:'userName',defaultValue:'xpcName',description:'please give me a name ')
//	choice(name:'version',choices:['1.1','1.2','1.3'],description:'select the version to test')
//	booleanParam(name:'is_boy',defaultValue:true,description:'you are boy or not ')
//  }
    stages{
	stage('test'){
		steps{
			script{
				sh 'java -version'
				println 'hello 脚本式pipe构建 删除了sh的ll命令'
			}
		}
	}
	
	stage('Example if'){
		steps{
			// if(unit_test==true){
			// call run unit test
			//}
			println '代替删除了if语句'
		}
	}
	
	stage('deploy xpc Demo'){
		
		when{
			expression{
				return (unit_test=='true')
			}
		}
		steps{
			echo 'unit_test==true 的执行语句'
		}
         }
    }

}
