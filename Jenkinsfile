pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('Junit tests') {
      steps {
        bat 'C:\\Users\\USER\\Desktop\\runTests.bat'
      }
    }
    stage('shell') {
      steps {
        sh 'sh \'mvn clean verify\''
      }
    }
  }
}