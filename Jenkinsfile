pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('IsReported') {
      steps {
        fileExists 'C:\\Users\\USER\\Desktop\\kerem\\project demos\\cucumber_java-master\\cucumber_java-master\\target\\cucumber-html-reports\\overview-features.html'
      }
    }
  }
}