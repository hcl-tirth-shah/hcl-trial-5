FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app-1.jar
ENTRYPOINT ["java","-jar","/app-1.jar"]
EXPOSE 8081:8081

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY . .
#RUN mvn clean install
#CMD mvn spring-boot:run
#ADD target/hcl-trial-5-1.jar hcl-trial-5-1.jar
#ENTRYPOINT ["java","-jar","/hcl-trial-5.jar"]

#ENV HOME /root
#WORKDIR /app

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline

#COPY src ./src

#CMD ["./mvnw", "spring-boot:run"]