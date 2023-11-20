def call() {
    sh 'trivy image shravankumarp/youtube:latest > trivyimage.txt'
}