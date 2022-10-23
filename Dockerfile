FROM openjdk:11
EXPOSE 8080

WORKDIR /usr/src/app

COPY . .

# Run as non-root
RUN addgroup -g 1001 -S appuser && adduser -u 1001 -S appuser -G appuser
# RUN mkdir /logs && chown -R 1001:1001 /logs
RUN chown -R 1001:1001 /usr/src/app
USER 1001

RUN ./mvnw package

ENTRYPOINT ["java","-jar","/usr/src/app/target/sboot-demo.0.0.1.jar"]