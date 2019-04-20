
pipelineJob("Bash Script Pipeline") {
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
                scriptPath('bashScript/Jenkinsfile')
            }
        }
    }

}
