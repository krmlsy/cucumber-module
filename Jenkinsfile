pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('') {
      steps {
        sh 'mvn verify'
      }
    }
  }
}