Pipeline {
    agent any
    environment {
        unit_test = true
    }
    stages {
        stage('Example') {
            steps {
                if(unit_test == true) {
                   println "检测到weitrue的条件"
		   // call run unit test methods
                }
            }
        }
    }
}
