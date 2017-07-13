def auther = 'george.liou'
def proj   = 'ACR'

multibranchPipelineJob(proj) {
  branchSources {
    git {
      remote("ssh://git@rd.grandsys.com:8687/${auther}/${proj}.git")
      credentialsId('gitlab-inu')
      includes('*')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(7)
    }
  }
}