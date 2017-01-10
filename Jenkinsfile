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
    }
  }

  stage('Test') {

  }

  stage('Deploy') {

  }
}
