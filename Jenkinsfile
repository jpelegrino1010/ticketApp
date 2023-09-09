pipeline {
    agent any
    stages {
        stage("clone code") {
            steps {
                git branch: 'main', url: 'https://github.com/jpelegrino1010/ticketApp.git'
            }
        }
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