FROM openjdk:8-jre
MAINTAINER David Flemström <dflemstr@spotify.com>

#ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
ADD target/           /usr/share/tag/container-test.jar
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/tag/container-test.jar

# Command line to execute the test
ENTRYPOINT ["/usr/bin/java", "-cp", "/usr/share/tag/container-test.jar", "org.testng.TestNG", "-testclass", "Docker.GoogleTest"]
