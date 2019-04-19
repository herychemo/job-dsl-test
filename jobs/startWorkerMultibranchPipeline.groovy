
multibranchPipelineJob("Start Java Worker") {
    branchSources {
        git {
            remote ("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
            credentialsId('git-ssh')
            includes('*')
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('javaWorker/startWorker_Jenkinsfile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
