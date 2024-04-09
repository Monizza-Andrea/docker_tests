FROM openjdk:17-jdk

WORKDIR /prova

COPY target/dockerTest-provadocker.jar /prova/dockerTest.jar

EXPOSE 8080

CMD ["java", "-jar", "dockerTest.jar"]