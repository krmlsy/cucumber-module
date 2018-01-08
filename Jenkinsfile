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
        bat(script: 'C:\\Users\\USER\\Desktop\\runTests.bat', returnStatus: true, returnStdout: true)
      }
    }
  }
}