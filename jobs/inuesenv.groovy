def auther = 'jaohaohsuan'

multibranchPipelineJob('iNuElasticsearchConfig') {
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