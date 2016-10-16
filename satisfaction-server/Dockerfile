FROM java:openjdk-8-alpine

MAINTAINER Daniel Lavoie <daniel.lavoie@invivoo.com>

EXPOSE 8080

CMD ["java", "-jar", "/srv/satisfaction/satisfaction-server.jar"]

ADD target/satisfaction-server.jar /srv/satisfaction/satisfaction-server.jar