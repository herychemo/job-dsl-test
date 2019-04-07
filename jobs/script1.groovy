project_name = "Quick Test Pipeline"
repo = "git@gitlab.com:herychemo/QuickTestJenkinsFile.git"
repo_name = "QuickTest"
cred_id = 'ssh'
script_path = 'Jenkinsfile'

pipelineJob(project_name) {
    definition {

        cpsScm {
            scm {
                git {
                    credentials(cred_id)
                    remote {
                        name(repo_name)
                        url(repo)
                    }
                }
                scriptPath(script_path)
            }
        }
    }
}
