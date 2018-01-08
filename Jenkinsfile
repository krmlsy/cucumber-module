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
        cucumber(fileIncludePattern: '**/cucumber.json', jsonReportDirectory: 'target/cucumber', trendsLimit: 10)
      }
    }
    stage('Publish Report') {
      steps {
        script {
          publishHTML([allowMissing: true, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'C:\\Program Files (x86)\\Jenkins\\workspace\\cucumber-module_master-3GHERGXTIQPRBKVCHAOUUEMA6H7LFNSPQZ4TWWGLL2YMXZA5LPFQ\\target\\cucumber-html-reports', reportFiles: 'overview-features.html', reportName: 'Cucumber Report', reportTitles: ''])
        }
        
      }
    }
  }
}