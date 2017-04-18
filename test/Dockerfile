FROM java:8

# Install maven
#RUN apt-get update
#RUN apt-get install -y maven

#WORKDIR /code
COPY target/CucumberBasic-1.0-SNAPSHOT-jar-with-dependencies.jar /home/CucumberBasic-1.0-SNAPSHOT-jar-with-dependencies.jar
# Prepare by downloading dependencies
#ADD pom.xml /code/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
#ADD src /code/src
#RUN ["mvn", "package"]

#EXPOSE 4567
CMD ["java", "-Dfile.encoding=UTF-8 ", "-jar", "/home/CucumberBasic-1.0-SNAPSHOT-jar-with-dependencies.jar"]
