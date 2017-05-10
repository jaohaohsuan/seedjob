def auther = 'grandsys'
def proj   = 'helm-repository'

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