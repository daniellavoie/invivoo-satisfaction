node { // <1>
  stage('Build') { // <2>
    scm checkout
    withMaven(
      maven: 'maven-3',
      globalMavenSettingsConfig: 'invivoo-settings',
      mavenLocalRepo: '.repository'
    ) {
      // Run the maven build
      sh "mvn clean deploy"
    }
  }
  stage('Test') {
    /* .. snip .. */
  }
  stage('Deploy') {
    /* .. snip .. */
  }
}
