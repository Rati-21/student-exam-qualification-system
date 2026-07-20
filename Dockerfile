FROM nginx:alpine
COPY . /usr/share/nginx/html
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY StudentMarks.java .
RUN javac StudentMarks.java
CMD ["java", "StudentMarks"]
