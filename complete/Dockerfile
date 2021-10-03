FROM openjdk:18-jdk-alpine3.13 as builder

WORKDIR /build 

COPY . .

RUN ./mvnw install

FROM openjdk:18-jdk-alpine3.13

WORKDIR /app

COPY --from=builder /build/target/app.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]