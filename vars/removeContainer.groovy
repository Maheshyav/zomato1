def call(){
    sh 'docker stop zomato'
    sh 'docker rm zomato'
}
