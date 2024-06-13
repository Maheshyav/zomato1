def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=zomato -Dsonar.projectKey=squ_ba6699cee099ddf5d2946520dc3a2a8ecdf39e0b'''
    }
}
