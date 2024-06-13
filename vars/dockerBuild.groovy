def call(String dockerHubUsername, String imageName) {
    withDockerRegistry(credentialsId: 'docker', toolName: 'docker'){   
                       sh "docker build -t zomato ."
                       sh "docker tag zomato maheshyav/zomato:latest "
                       sh "docker push maheshyav/zomato:latest "
    }
}
