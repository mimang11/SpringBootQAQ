FROM openjdk:8
COPY *.jar /app.jar
CMD ["--server.port=8989"]
EXPOSE 8989
ENTRYPOINT ["java","-jar","*.jar","--jasypt.encryptor.password=ammQAQ","/app.jar"]