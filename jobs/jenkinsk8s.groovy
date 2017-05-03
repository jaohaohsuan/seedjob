def auther = 'henry.jao'
def proj   = 'jenkins-kubernetes'

multibranchPipelineJob(proj) {
  branchSources {
    git {
      remote("ssh://git@rd.grandsys.com:8687/${auther}/${proj}.git")
      credentialsId('henry-gitlab')
      includes('*')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(7)
    }
  }
}
