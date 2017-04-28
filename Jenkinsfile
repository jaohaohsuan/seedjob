node {
    ansiColor('xterm') {
        try {
            stage('build') {
                checkout scm
                jobDsl ignoreMissingFiles: true, targets: 'jobs/**/*.groovy'
            }
        } catch (e) {
            echo "${e}"
            currentBuild.result = FAILURE
        }
        finally {
            echo 'well done'
        }
    }
}