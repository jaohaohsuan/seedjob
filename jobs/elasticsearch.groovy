def auther = 'jaohaohsuan'
def proj   = 'elasticsearch'

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
