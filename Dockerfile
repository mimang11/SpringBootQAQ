FROM openjdk:8
copY *.jar /app.jar
CMD ["--server.port=8989"]
EXPOSE 8989
ENTRYPOINT ["java","-jar","/app.jar"]