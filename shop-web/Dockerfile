FROM java:8

COPY target/shop-web.jar /opt/app/shop-web.jar
COPY config.yml /opt/app/config.yml
WORKDIR /opt/app
CMD ["java", "-jar", "shop-web.jar", "server", "config.yml"]
