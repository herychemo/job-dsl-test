
pipelineJob("Quick Test Pipeline") {
    definition {

        cpsScm {
            scm {
                git {
                    remote {
                        name("QuickTest")
                        url("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
    wrappers {
        sshAgent('ssh')
    }
}
