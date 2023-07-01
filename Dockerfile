FROM maven:3.8.5-openjdk-17
MAINTAINER Venant-Valéry Damien

WORKDIR /app
COPY pom.xml .
COPY RestApi.iml .
COPY mvnw .
COPY mvnw.cmd .
COPY src/. src/.

CMD ["mvn", "spring-boot:run"]
