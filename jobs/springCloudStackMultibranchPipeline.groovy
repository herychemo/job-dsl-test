
multibranchPipelineJob("Spring Cloud Stack Template") {
    triggers {
        cron("* * * * *")
    }
    branchSources {
        git {
            remote ("git@gitlab.com:herychemo/Spring-Cloud-Sample-Template.git")
            credentialsId('git-ssh')
            includes('*')
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('build_Jenkinsfile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
