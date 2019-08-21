Pipeline {
    agent any
    environment {
        unit_test = true
    }
    stages {
        stage('Example') {
            steps {
                if(unit_test == true) {
                   // call run unit test methods
                }
            }
        }
    }
}
