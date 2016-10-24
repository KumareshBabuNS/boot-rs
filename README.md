boot-rs
=======
Sample project to demonstrate how to use Jersey with Spring Boot.

To run locally
--------------
Just use the Spring Boot Maven plugin to run the app:

```shell
% mvn spring-boot:run
```

Or optionally build the executable JAR and run it:

```shell
% mvn package
% java -jar target 
```

Once the app is running, you can make a request to the "hello" endpoint to see the obligatory "Hello World" message:

```shell
% curl localhost:8080/hello
```

Noteworthy code
---------------
This is a Spring Boot app, much like any other Spring Boot app, including the near-boilerplate bootstrap class contained in `SpringRsApplication.java`.

Specific to the cause of enabling a JAX-RS endpoint, you'll find...

 * ...`JaxRsConfig.java` which extends `ResourceConfig` and registers the `HelloEndpoint` class. It is annotated with `@Component` so 
 that it will be discovered and an instance automatically created by Spring's component-scanning mechanism. 
 * ...`HelloEndpoint.java` which is just a simple JAX-RS endpoint.

In the Maven `pom.xml` build file, you'll notice that the only dependency (aside from Spring's testing starter) is the Spring Boot Jersey starter. This is a Spring Boot starter dependency that will transitively bring in:

 * `org.springframework.boot:spring-boot-starter` (the essential Spring Boot starter dependency)
 * `org.springframework.boot:spring-boot-starter-tomcat`
 * `org.springframework.boot:spring-boot-starter-validation`
 * `org.fasterxml.jackson.core:jackson-databind`
 * `org.springframework:spring-web`
 * `org.glassfish.jersey.core:jersey-server`
 * `org.glassfish.jersey.containers:jersey-container-servlet-core`
 * `org.glassfish.jersey.containers:jersey-container-servlet`
 * `org.glassfish.jersey.ext:jersey-bean-validation`

