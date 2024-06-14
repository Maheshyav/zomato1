def call(){
    sh "docker run -d --name zomato -p 3002:3000 maheshyav/zomato:latest"
}
