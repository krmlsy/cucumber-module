pipeline {
  agent any
  stages {
    stage('print') {
      steps {
        echo 'Tests started'
      }
    }
    stage('Run Junit') {
      steps {
        bat(script: 'C:\\Users\\USER\\Desktop\\runTests.bat', returnStatus: true, returnStdout: true)
      }
    }
    stage('IsReported') {
      steps {
        fileExists 'C:\\Users\\USER\\Desktop\\kerem\\project demos\\cucumber_java-master\\cucumber_java-master\\target\\cucumber-html-reports\\overview-features.html'
      }
    }
    stage('cucumber') {
      steps {
        cucumber(fileIncludePattern: 'target/cucumber/cucumber.json', fileExcludePattern: '0', jsonReportDirectory: '0', sortingMethod: '0')
      }
    }
  }
}