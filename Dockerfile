FROM maven as build
WORKDIR/app
COPY ..
RUN mvn install
FROM open jdk:11.0
WORKDIR /app
COPY --from=build/app/target/Csvdownload2-0.0.1-SNAPSHOT.jar
EXPOSE 9090
CMD ["java","-jar","Csvdownload2-0.0.1-SNAPSHOT.jar"]