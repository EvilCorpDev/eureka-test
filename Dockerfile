FROM java:8
CMD ["java", "-Xmx80m" ,"-jar", "/opt/app.jar", "--spring.profiles.active=docker"]
