
pipelineJob("Some Script Pipeline") {
    definition {

        cpsScm {
            scm {
                git {
                    remote {
                        name("QuickTest")
                        url("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
                        credentials('ssh')
                    }
                }
                scriptPath('someScript_JenkinsFile')
            }
        }
    }

}
