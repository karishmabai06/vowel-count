pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Checkout Git') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Run Java Program') {
            steps {
                bat 'mvn exec:java'
            }
        }

        stage('Run JUnit Test') {
            steps {
                bat 'mvn clean test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }

    post {
        always {
            echo 'Maven execution completed.'
        }
    }
}
