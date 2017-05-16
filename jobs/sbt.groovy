def auther = 'jaohaohsuan'
def proj   = 'sbt'

pipelineJob(proj) {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            name('origin')
            url("https://github.com/${auther}/${proj}.git")
          }
          branch('*/universal')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
  logRotator {
    numToKeep(5)
  }
}