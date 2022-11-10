FROM openjdk:8
COPY *.jar /app.jar
CMD ["--server.port=8989 --jasypt.encryptor.password=ammQAQ"]
EXPOSE 8989
ENTRYPOINT ["java","-jar","/app.jar"]
