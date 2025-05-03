// vars/buildMaven.groovy

def call(String mvnOpts = '') {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Build') {
                steps {
                    script {
                        sh "mvn clean install ${mvnOpts}"
                    }
                }
            }
        }
    }
}
