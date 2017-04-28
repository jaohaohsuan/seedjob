def auther = 'jaohaohsuan'
def repo = 'inu-es-env'

multibranchPipelineJob(repo) {
  branchSources {
    git {
      remote("https://github.com/${auther}/${repo}.git")
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(7)
    }
  }
}