podTemplate(
    label: 'seedjobs', 
    containers: [
        containerTemplate(name: 'jnlp', image: 'henryrao/jnlp-slave', args: '${computer.jnlpmac} ${computer.name}', alwaysPullImage: true)
    ],
    volumes: [
        hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
    ]) {
           
    node('seedjobs') {
        def image
        stage('git clone') {
            checkout scm
        }
        stage('build') {
            try {
                jobDsl ignoreMissingFiles: true, targets: 'jobs/**/*.groovy'
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