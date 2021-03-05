pipeline {
    agent any
    tools {
        maven 'maven363'
    }
    stages {
        stage('Version') {
            steps {
                echo "Testing..."
                sh 'mvn --version'
            }
        }
        
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Integration test') {
            steps {
                sh 'mvn integration-test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -DskipTest'
            }
        }
    }
}
