def call() {
  sh 'echo hi from DevOps team. This is shared library example.'
}

// Deploy war file into multiple servers
// In Jenkinsfile create a variable staging_server and add servers in comma separated
def war(){
  echo "Deploying War file"
}

//Deploy react application
def react(){
  echo "Deploying React Application"
}
