Pipeline {
    agent any
   
    stages {
        stage('Example') {
            steps {
                println "hello example "
            }
        }
    }
}
