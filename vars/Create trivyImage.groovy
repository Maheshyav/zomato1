def call() {
    sh 'trivy image maheshyav/zomato:latest > trivyimage.txt'
}
