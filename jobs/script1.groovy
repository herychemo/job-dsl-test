def project_name = "Quick Test Pipeline"
def repo = "git@gitlab.com:herychemo/QuickTestJenkinsFile.git"
def repo_name = "QuickTest"
def cred_id = 'ssh'
def script_path = 'Jenkinsfile'

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
