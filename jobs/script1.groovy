
pipelineJob("Quick Test Pipeline") {
    definition {

        cpsScm {
            scm {
                git {
                    credentials('ssh')
                    remote {
                        name("QuickTest")
                        url("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}
