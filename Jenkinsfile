pipeline {
    agent any

    stages {
        stage('Checkout Git') {
            steps {
                checkout scm
            }
        }

        stage('Maven install') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Build Docker') {
            steps {
                sh 'docker build -t yosraabdelkader5/devops-yosra .'
            }
        }

        stage('Push Docker') {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pass', variable: 'PASS')]) {
                    sh "echo $PASS | docker login -u yosraabdelkader5 --password-stdin"
                    sh 'docker push yosraabdelkader5/devops-yosra'
                }
            }
        }

        stage('Post Actions') {
            steps {
                echo 'Pipeline completed successfully!'
            }
        }
    }
}
