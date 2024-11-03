# Documentation Overview

This section provides a brief overview of Spring Boot reference documentation. It serves as a map for the rest of the document.

## First Steps

If you are getting started with Spring Boot or 'Spring' in general, start with the following topics:

**From scratch** [Overview](https://docs.spring.io/spring-boot/index.html) | [Requirements](https://docs.spring.io/spring-boot/system-requirements.html) | [Installation](https://docs.spring.io/spring-boot/installing.html)

**Tutorial** [Part 1](https://docs.spring.io/spring-boot/tutorial/first-application/index.html) | [Part 2](https://docs.spring.io/spring-boot/tutorial/first-application/index.html#getting-started.first-application.code)

**Running your example** [Part 1](https://docs.spring.io/spring-boot/tutorial/first-application/index.html#getting-started.first-application.run) | [Part 2](https://docs.spring.io/spring-boot/tutorial/first-application/index.html#getting-started.first-application.executable-jar)

## Upgrading From an Earlier Version

You should always ensure that you are running a [supported version](https://github.com/spring-projects/spring-boot/wiki/Supported-Versions) of Spring Boot.

Depending on the version that you are upgrading to, you can find some additional tips here:

**From 1.x** [Upgrading from 1.x](https://docs.spring.io/spring-boot/upgrading.html#upgrading.from-1x)

**To a new feature release** [Upgrading to New Feature Release](https://docs.spring.io/spring-boot/upgrading.html#upgrading.to-feature)

**Spring Boot CLI** [Upgrading the Spring Boot CLI](https://docs.spring.io/spring-boot/upgrading.html#upgrading.cli)

## Developing With Spring Boot

Ready to actually start using Spring Boot? [We have you covered](https://docs.spring.io/spring-boot/reference/using/index.html):

**Build systems** [Maven](https://docs.spring.io/spring-boot/reference/using/build-systems.html#using.build-systems.maven) | [Gradle](https://docs.spring.io/spring-boot/reference/using/build-systems.html#using.build-systems.gradle) | [Ant](https://docs.spring.io/spring-boot/reference/using/build-systems.html#using.build-systems.ant) | [Starters](https://docs.spring.io/spring-boot/reference/using/build-systems.html#using.build-systems.starters)

**Best practices** [Code Structure](https://docs.spring.io/spring-boot/reference/using/structuring-your-code.html) | [@Configuration](https://docs.spring.io/spring-boot/reference/using/configuration-classes.html) | [@EnableAutoConfiguration](https://docs.spring.io/spring-boot/reference/using/auto-configuration.html) | [Beans and Dependency Injection](https://docs.spring.io/spring-boot/reference/using/spring-beans-and-dependency-injection.html)

**Running your code** [IDE](https://docs.spring.io/spring-boot/reference/using/running-your-application.html#using.running-your-application.from-an-ide) | [Packaged](https://docs.spring.io/spring-boot/reference/using/running-your-application.html#using.running-your-application.as-a-packaged-application) | [Maven](https://docs.spring.io/spring-boot/reference/using/running-your-application.html#using.running-your-application.with-the-maven-plugin) | [Gradle](https://docs.spring.io/spring-boot/reference/using/running-your-application.html#using.running-your-application.with-the-gradle-plugin)

**Packaging your app** [Production jars](https://docs.spring.io/spring-boot/reference/using/packaging-for-production.html)

**Spring Boot CLI** [Using the CLI](https://docs.spring.io/spring-boot/cli/index.html)

## Learning About Spring Boot Features

Need more details about Spring Boot’s core features? [The following content is for you](https://docs.spring.io/spring-boot/reference/features/index.html):

**Spring Application** [SpringApplication](https://docs.spring.io/spring-boot/reference/features/spring-application.html)

**External Configuration** [External Configuration](https://docs.spring.io/spring-boot/reference/features/external-config.html)

**Profiles** [Profiles](https://docs.spring.io/spring-boot/reference/features/profiles.html)

**Logging** [Logging](https://docs.spring.io/spring-boot/reference/features/logging.html)

## Web

If you develop Spring Boot web applications, take a look at the following content:

**Servlet Web Applications**: [Spring MVC, Jersey, Embedded Servlet Containers](https://docs.spring.io/spring-boot/reference/web/servlet.html)

**Reactive Web Applications**: [Spring Webflux, Embedded Servlet Containers](https://docs.spring.io/spring-boot/reference/web/reactive.html)

**Graceful Shutdown**: [Graceful Shutdown](https://docs.spring.io/spring-boot/reference/web/graceful-shutdown.html)

**Spring Security**: [Default Security Configuration, Auto-configuration for OAuth2, SAML](https://docs.spring.io/spring-boot/reference/web/spring-security.html)

**Spring Session**: [Auto-configuration for Spring Session](https://docs.spring.io/spring-boot/reference/web/spring-session.html)

**Spring HATEOAS**: [Auto-configuration for Spring HATEOAS](https://docs.spring.io/spring-boot/reference/web/spring-hateoas.html)

## Data

If your application deals with a datastore, you can see how to configure that here:

**SQL**: [Configuring a SQL Datastore, Embedded Database support, Connection pools, and more.](https://docs.spring.io/spring-boot/reference/data/sql.html)

**NOSQL**: [Auto-configuration for NOSQL stores such as Redis, MongoDB, Neo4j, and others.](https://docs.spring.io/spring-boot/reference/data/nosql.html)

## Messaging

If your application uses any messaging protocol, see one or more of the following sections:

**JMS**: [Auto-configuration for ActiveMQ and Artemis, Sending and Receiving messages through JMS](https://docs.spring.io/spring-boot/reference/messaging/jms.html)

**AMQP**: [Auto-configuration for RabbitMQ](https://docs.spring.io/spring-boot/reference/messaging/amqp.html)

**Kafka**: [Auto-configuration for Spring Kafka](https://docs.spring.io/spring-boot/reference/messaging/kafka.html)

**Pulsar**: [Auto-configuration for Spring for Apache Pulsar](https://docs.spring.io/spring-boot/reference/messaging/pulsar.html)

**RSocket**: [Auto-configuration for Spring Framework’s RSocket Support](https://docs.spring.io/spring-boot/reference/messaging/rsocket.html)

**Spring Integration**: [Auto-configuration for Spring Integration](https://docs.spring.io/spring-boot/reference/messaging/spring-integration.html)

## IO

If your application needs IO capabilities, see one or more of the following sections:

**Caching**: [Caching support with EhCache, Hazelcast, Infinispan, and more](https://docs.spring.io/spring-boot/reference/io/caching.html)

**Quartz**: [Quartz Scheduling](https://docs.spring.io/spring-boot/reference/io/quartz.html)

**Mail**: [Sending Email](https://docs.spring.io/spring-boot/reference/io/email.html)

**Validation**: [JSR-303 Validation](https://docs.spring.io/spring-boot/reference/io/validation.html)

**REST Clients**: [Calling REST Services with RestTemplate and WebClient](https://docs.spring.io/spring-boot/reference/io/rest-client.html)

**Webservices**: [Auto-configuration for Spring Web Services](https://docs.spring.io/spring-boot/reference/io/webservices.html)

**JTA**: [Distributed Transactions with JTA](https://docs.spring.io/spring-boot/reference/io/jta.html)

## Container Images

Spring Boot provides first-class support for building efficient container images. You can read more about it here:

**Efficient Container Images**: [Tips to optimize container images such as Docker images](https://docs.spring.io/spring-boot/reference/packaging/container-images/efficient-images.html)

**Dockerfiles**: [Building container images using dockerfiles](https://docs.spring.io/spring-boot/reference/packaging/container-images/dockerfiles.html)

**Cloud Native Buildpacks**: [Support for Cloud Native Buildpacks with Maven and Gradle](https://docs.spring.io/spring-boot/reference/packaging/container-images/cloud-native-buildpacks.html)

## Moving to Production

When you are ready to push your Spring Boot application to production, we have [some tricks](https://docs.spring.io/spring-boot/how-to/actuator.html) that you might like:

**Management endpoints**: [Overview](https://docs.spring.io/spring-boot/reference/actuator/endpoints.html)

**Connection options**: [HTTP](https://docs.spring.io/spring-boot/reference/actuator/monitoring.html) | [JMX](https://docs.spring.io/spring-boot/reference/actuator/jmx.html)

**Monitoring**: [Metrics](https://docs.spring.io/spring-boot/reference/actuator/metrics.html) | [Auditing](https://docs.spring.io/spring-boot/reference/actuator/auditing.html) | [HTTP Exchanges](https://docs.spring.io/spring-boot/reference/actuator/http-exchanges.html) | [Process](https://docs.spring.io/spring-boot/reference/actuator/process-monitoring.html)

## Optimizing for Production

s
Spring Boot applications can be optimized for production using technologies described in these sections:

**Efficient Deployments**: [Unpacking the Executable JAR](https://docs.spring.io/spring-boot/reference/packaging/efficient.html#packaging.efficient.unpacking)

**GraalVM Native Images**: [Introduction](https://docs.spring.io/spring-boot/reference/packaging/native-image/introducing-graalvm-native-images.html) | [Advanced Topics](https://docs.spring.io/spring-boot/reference/packaging/native-image/advanced-topics.html) | [Getting Started](https://docs.spring.io/spring-boot/how-to/native-image/developing-your-first-application.html) | [Testing](https://docs.spring.io/spring-boot/how-to/native-image/testing-native-applications.html)

**Class Data Sharing**: [Overview](https://docs.spring.io/spring-boot/reference/packaging/class-data-sharing.html)

**Checkpoint and Restore**: [Overview](https://docs.spring.io/spring-boot/reference/packaging/checkpoint-restore.html)

## Advanced Topics

Finally, we have a few topics for more advanced users:

**Spring Boot Applications Deployment**: [Cloud Deployment](https://docs.spring.io/spring-boot/how-to/deployment/cloud.html) | [OS Service](https://docs.spring.io/spring-boot/how-to/deployment/installing.html)

**Build tool plugins**: [Maven](https://docs.spring.io/spring-boot/maven-plugin/index.html) | [Gradle](https://docs.spring.io/spring-boot/gradle-plugin/index.html)

**Appendix**: [Application Properties](https://docs.spring.io/spring-boot/appendix/application-properties/index.html) | [Configuration Metadata](https://docs.spring.io/spring-boot/specification/configuration-metadata/index.html) | [Auto-configuration Classes](https://docs.spring.io/spring-boot/appendix/auto-configuration-classes/index.html) | [Test Auto-configuration Annotations](https://docs.spring.io/spring-boot/appendix/test-auto-configuration/index.html) | [Executable Jars](https://docs.spring.io/spring-boot/specification/executable-jar/index.html) | [Dependency Versions](https://docs.spring.io/spring-boot/appendix/dependency-versions/index.html)
