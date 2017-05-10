def auther = 'henry.jao'
def proj   = 'cassandra'

pipelineJob(proj) {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            name('origin')
            url("ssh://git@rd.grandsys.com:8687/${auther}/${proj}.git")
            credentials('gitlab-inu')
          }
          branch('*/cassandra3.9')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
  logRotator {
    numToKeep(5)
  }
}