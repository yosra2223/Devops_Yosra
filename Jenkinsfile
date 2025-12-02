pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub')  
        IMAGE_NAME = "yosraabdelkader5/devops-yosra"
        IMAGE_TAG = "1.0.0"
    }

    stages {

        stage('Checkout SCM') {
            steps {
                echo "Checkout Jenkins internal SCM"
                checkout scm
            }
        }

        stage('Checkout Git') {
            steps {
                echo "Cloning GitHub repo"
                git branch: 'main', url: 'https://github.com/yosra2223/Devops_Yosra.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh "./mvnw clean package -DskipTests"
            }
        }

        stage('Build Docker Image') {
            steps {
                sh """
                docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .
                """
            }
        }

        stage('Push Docker Image') {
            steps {
                sh """
                echo "${DOCKERHUB_CREDENTIALS_PSW}" | docker login -u "${DOCKERHUB_CREDENTIALS_USR}" --password-stdin
                docker push ${IMAGE_NAME}:${IMAGE_TAG}
                """
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed."
        }
    }
}
s