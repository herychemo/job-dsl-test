
multibranchPipelineJob("Quick Test MultiBranch pipeline") {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote {
                name('QuickTest')
                url("git@gitlab.com:herychemo/QuickTestJenkinsFile.git")
                credentials('ssh')
            }
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
