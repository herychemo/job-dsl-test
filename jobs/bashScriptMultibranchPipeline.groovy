
multibranchPipelineJob("Bash Script MultiBranch Pipeline") {
    triggers {
        cron("* * * * *")
    }
    branchSources {
        git {
            remote ("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
            credentialsId('git-ssh')
            includes('*')
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('bashScript/Jenkinsfile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
