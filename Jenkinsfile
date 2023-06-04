pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean'
            }
            post {
                success {
                    echo "Now Archiving the Artifacts......."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'junit5_Tutorial/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
