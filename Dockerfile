FROM openjdk:11
WORKDIR /app
COPY ./build/libs/timer.jar /app
CMD ["java","-jar","/app/timer.jar"]