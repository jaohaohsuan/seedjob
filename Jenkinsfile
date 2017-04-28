podTemplate(
    label: 'seedjob',
    containers: [
            containerTemplate(name: 'jnlp', image: 'henryrao/jnlp-slave', args: '${computer.jnlpmac} ${computer.name}', alwaysPullImage: true)
    ],
    volumes: [
            hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
    ]) {

    node('seedjob') {
        ansiColor('xterm') {
            try {
                stage('build') {
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
}