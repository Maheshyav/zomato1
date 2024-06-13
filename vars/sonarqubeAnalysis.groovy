def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=jenkins -Dsonar.projectKey=squ_8344b591a2fd2917b4accfea5a0ab2f0caaf9cbb '''
    }
}
