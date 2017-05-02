def auther = 'jaohaohsuan'
def proj   = 'jenkins-kubernetes'

multibranchPipelineJob(proj) {
  branchSources {
    git {
      remote("https://github.com/${auther}/${proj}.git")
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(7)
    }
  }
}
