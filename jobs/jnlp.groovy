def auther = 'henry.jao'
def proj   = 'jnlp-slave'

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
          branch('*/pipeline')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
  logRotator {
    numToKeep(5)
  }
}