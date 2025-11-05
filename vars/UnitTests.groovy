def call() {
    echo '========== Running Unit Tests =========='
    sh 'mvn test'
    echo '========== Unit Tests Completed =========='
}