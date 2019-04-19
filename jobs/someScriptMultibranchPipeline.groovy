
multibranchPipelineJob("Some Script MultiBranch Pipeline") {
    triggers {
        periodic(1)
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
            scriptPath('someScript/someScript_JenkinsFile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
