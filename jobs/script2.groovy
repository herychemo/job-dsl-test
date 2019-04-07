project_name = "Quick Test MultiBranch pipeline"
repo = "git@gitlab.com:herychemo/QuickTestJenkinsFile.git"
repo_name = "QuickTest"
cred_id = 'ssh'
script_path = 'Jenkinsfile'

multibranchPipelineJob(project_name) {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote {
                name(repo_name)
                url(repo)
            }
            credentialsId(cred_id)
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
