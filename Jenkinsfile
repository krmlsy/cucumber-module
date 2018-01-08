pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('Junit Tests') {
      steps {
        sh '''cd C:\\Users\\USER\\Desktop\\kerem\\project demos\\cucumber_java-master\\cucumber_java-master
mvn verify'''
      }
    }
  }
}