def auther = 'jaohaohsuan'
def proj   = 'inu-es-env'

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