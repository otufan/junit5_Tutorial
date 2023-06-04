pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -f junit5_Tutorial/pom.xml -B -DskipTests clean package'
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
                sh 'mvn -f junit5_Tutorial/pom.xml test'
            }
            post {
                always {
                    junit 'junit5_Tutorial/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
