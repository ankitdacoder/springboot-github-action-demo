FROM openjdk:8
EXPOSE 8080
ADD target/springboot-rabbitmq-demo.jar springboot-rabbitmq-demo.jar
ENTRYPOINT ["java","-jar","/springboot-rabbitmq-demo.jar"]