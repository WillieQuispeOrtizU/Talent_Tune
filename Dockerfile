FROM openjdk:21
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Talent_Tune-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Proyecto_Talent_Tune.jar
ENTRYPOINT ["java","-jar","/Proyecto_Talent_Tune.jar"]