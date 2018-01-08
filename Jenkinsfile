pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('shell') {
      steps {
        sh 'sh \'mvn clean verify\''
      }
    }
  }
}