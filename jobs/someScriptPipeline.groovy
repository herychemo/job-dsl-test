
pipelineJob("Some Script Pipeline") {
    definition {

        cpsScm {
            scm {
                git {
                    remote {
                        name("QuickTest")
                        url("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
                        credentials('git-ssh')
                    }
                }
                scriptPath('someScript/someScript_JenkinsFile')
            }
        }
    }

}
