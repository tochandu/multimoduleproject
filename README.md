Overview
===========
**Springboot Template** is a real-time service that can be used as template to create any service.

Architecture
===========
Springboot Template is a web application deployed via JAR on inbuilt Tomcat Server (TC).


Technology Stack
===========
* Java 8
* Gradle 4.X
* Junit 5
* IntelliJ IDEA
* SpringBoot 2x
* Spring Framework 4.3.12
* Cucumber 1.2.5
* Guava 23.0
* Jackson 2.9.5
* RabbitMQ
* KAFKA
* Oracle Database
* Hystrix (Netflix OSS)


Getting Started
---------------
* Get the source code from git repository

  ```
  $ git clone https://dev.azure.com/cgfsdigitalassets/ProjectKilo/_git/SpringbootTemplate
  ```

* Import the source code as a Gradle project into IDEA
* Run Gradle tasks

## Modules
We organized the Springboot Template into number of modules based on **Domain Driven Design** principles.The organization of dependencies is
arranged to be somewhat faithful to the
[Clean Architecture](http://blog.8thlight.com/uncle-bob/2012/08/13/the-clean-architecture.html).

### Api
  The api modules contains generated java classes from schema which are used to create java objects for request and response from the verify Identity micro service.
  It also contains RAML(RESTful API Modeiling Language), which helps to manage the API.

### App
   The app module contains the main service class for the microservice. Invoked by REST and Message Queue classes in webapp module.

   Dependencies: Data (Messaging/Databases), Api(JSON), Domain(Interfaces).

### Bdd
   This module contains the Cucumber-Gherkin-based behavior driven development test cases.

   Dependencies: All Modules.

### Common
   This contains common modules (to be eventually) shared across projects. As time goes by, more code should reside here (and microservice code mainly focus on the framework)

   Dependencies: None.

### Domain
 **This contains the internal data structures used within the application.**
  * It allows a clean separation between the data structures used by the microservice and the software/service data structures it connects to Messaging, databases etc
  * These structures are primarily defined via interfaces. And we typically program to the interface.

  Dependencies: Common, Api.

### Data
**This is the data access module and it connects to:**
 1) Various Systems of Record (SORS) services such as Databases, Messaging, Bloomberb, Reuters etc.

 **Configuration of this module is as follows:**
 * Spring annotations (or xml equivalents) for static configuration will be in the data module (e.g. ecpr.xml under resources subdirectory)
 * Environment configuration will be done at the webapp module (in its respective resources directory).

 Dependencies: Domain.

### Webapp
 This is the web application module which enables external clients and message queues to connect to the microservice.

 Dependencies: App, API.

### Configuration Profiles per Environment
 The **webapp** module includes configuration profiles to support different configuration
 settings for the various environments the application will be deployed to.

 Profiles can be found beneath `webapp/src/main/java/resources`. Each environment specific configuration is specified in appplication-<profile>.yml ex--> application-uat.yml

## Building
 Gradle is used for building the application. You should favor using the Gradle Wrapper (the
 `gradlew.bat` and `gradlew` scripts). This frees you from having to install Gradle locally and
 ensures that everyone is using the same version of Gradle. The scripts and dependent JARs can be
 found in `build/gradle`.

 To see all of the tasks that are available run `gradlew tasks`. To assemble the
 application run `gradlew dist`. The build process will download any dependencies
 into `$HOME\.gradle`. The build process will put all of the artifacts into `target`. After the
 build completes you will find an environment agnostic WAR file, configuration bundles for all of
 the environments, and a ZIP of the schemas and WSDLs. **The WAR file needs to be combined with one
 of the environment bundles to produce a WAR that can be deployed.**


## Development
 The build scripts are designed to support development in Intellij IDEA. After checking
 out the source code run `gradlew idea`.

 Intellij IDEA provides integrated support for Gradle. When you open the project for the first time
 you should be prompted to link to the Gradle project. You will want to click on the "Refresh"
 icon in the tool to sync the dependencies defined in the build scripts and Intellij IDEA.


### Gradle Build Scripts
 The main project has three files at its root to support the Gradle build: `build.gradle`,
 `settings.gradle`, and `gradle.properties`. Each module has its own `build.gradle` file that
 defines its dependencies and any specialized behavior.

 The main `build.gradle` file defines the things common to all modules. One convention adopted
 here is to define all versions of third-party libraries in one place. This is simply something that
 makes it easy to ensure version consistency across modules.

 The `settings.gradle` file defines all of the modules that make up the main project. If you rename
 or add a module you will need to update this file.

 The `gradle.properties` file is a means to define properties for your project. For example, while
 the included code gets the version information from the CM checkpoint file you could define the
 version in `gradle.properties`. The file currently uses two properties to instruct Gradle to run
 as a daemon process (improves build times) and defines how much memory it may use.

### Running the Application
 To run Identity Verification application in your IDEA use the `webapp.src.main.java.captemplate.lifecyle.CapTemplateApplication` class. This launches
 an application that uses Embedded Undertov server to serve the webapp. By default, the application will listen on port
 `8080`. The default port can be changed in application.yml.
 You could use Gradle Task 'Application bootRun' to bring up the instance in IDEA. If you want to activate specific Spring profile to configure environment,
 pass the active profile name as a VM argument to the application like `-Dspring.profiles.active=dev`.
 
### Request Mapping

**Health Check**

https://localhost:8080/healthCheck

**Capgemini Template Service**
(GET)
https://localhost:8090/api/capTemplate/v1/
(POST)
https://localhost:8090/api/capTemplateMessage/v1/

