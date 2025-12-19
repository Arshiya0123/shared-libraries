def trivy-fs(){
  sh "trivy fs . -o results.json
}
