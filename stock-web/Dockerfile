FROM java:8

COPY target/service-web.jar /opt/app/service-web.jar
COPY config.yml /opt/app/config.yml
WORKDIR /opt/app
CMD ["java", "-jar", "service-web.jar", "server", "config.yml"]
