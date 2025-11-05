def buildDockerImage() {
    echo 'Building Docker image...'
    sh 'docker build -t $IMAGE_NAME:$BUILD_NUMBER .'
}