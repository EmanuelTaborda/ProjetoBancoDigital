FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . /app

RUN javac -d out $(find src -name "*.java")

CMD ["java", "-cp", "out", "Main"]
