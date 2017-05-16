def auther = 'jaohaohsuan'
def proj   = 'inu-alpha'

pipelineJob(proj) {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            name('origin')
            url("https://github.com/${auther}/${proj}.git")
          }
          branch('*/jenkins-pipeline')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
  logRotator {
    numToKeep(5)
  }
}