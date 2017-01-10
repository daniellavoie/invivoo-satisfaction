node {
  stage('Build') {
    withMaven(
      maven: 'maven-3',
      globalMavenSettingsConfig: 'invivoo-settings',
      mavenLocalRepo: '.repository'
    ) {
      checkout scm

      // Run the maven build
      sh "mvn clean deploy"

      docker
        .withServer([uri: "unix:///var/run/docker.sock"])
        .build("daniellavoie/satisfaction", "-f satisfaction-server/Dockerfile")
    }
  }

  stage('Test') {

  }

  stage('Deploy') {

  }
}
