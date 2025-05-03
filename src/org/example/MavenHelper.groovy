// src/org/example/MavenHelper.groovy

package org.example

class MavenHelper {
    static String getMavenVersion() {
        return sh(script: 'mvn -v', returnStdout: true).trim()
    }
}
