pipeline {
    agent any
    stages {
        stage("build code") {
                steps {
                    bat "mvn clean install"
                }
        }
        stage("Start container") {
            steps {
               bat "docker-compose up"
               bat "docker-compose ps"
            }

        }

    }

}