def auther = 'jaohaohsuan'

multibranchPipelineJob('inu-es-env') {
  branchSources {
    git {
      remote("https://github.com/${auther}/inu-es-env.git")
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(7)
    }
  }
}