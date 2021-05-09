# Service Registry #

This project contains the service registry application for all the micro services
that belongs to store and all should be registered in this service.


### Prerequisite ###

* Spring Boot 2.4.3
* Spring Cloud 2020.0.1
* Java 11 (Amazon Corretto)
* Gradle 6.7.xx

### Initial Project Setup ###

* Service is default running on "dev" profile you can enforce production environment with and environment variable.
```
SPRING_PROFILES_ACTIVE=prod ./gradlew bootRun
java -jar -Dspring.profiles.active=prod final_build.jar
```

### Repository Details ###

* https://bitbucket.org/summitinnovations/pts-service-registry-svc