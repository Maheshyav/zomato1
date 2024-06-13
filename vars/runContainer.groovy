def call(){
    sh "docker run -d --name zomato -p 3002:3002 maheshyav/zomato:latest"
}
