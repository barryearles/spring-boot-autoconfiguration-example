
#Spring Boot Auto-Configuration Example

---
Providing auto configuration for your project provides a user friendly experience for anyone wishing to include your library in their project.  The auto configuration contains all of the necessary configuration required to quickly set up a configured environment.

This example consists of 3 submodules (serivce, auto-configuration, and application).

## Submodules 

The `service` submodule contains an example REST controller that returns a configured `String` (configured from the auto-configuration submodule).

The `auto-configuration` submodule contains an `@Configuration` class called `ServiceConfiguration` that configures the `ExampleController`'s `getData` result.  The key to auto-configuration here is in the `auto-configuration/src/main/resources/META-INF/spring.factories` file.  This file tells Spring that the `com.example.autoconfigure.ServiceConfiguration` class provides the default "auto" configuration.

The `application` submodule is a Spring Boot application that is annotated with `@SpringBootApplication` and `@SpringWebMvc`.  It hosts an endpoint at `http://localhost:8080/getData` that returns the default configured value.  You'll notice that the `SpringBootAutoconfigureExampleApplication` has several lines commented out.  If you start the application with these lines commented out, you will see the default configured value returned when hitting `getData`.  You can uncomment the `@Configuration` line and also uncomment the block of code starting with `@Bean`.  Doing so will override the default configuration as expected.

## Auto Configuration Unit Tests Examples

2 unit tests exist for testing the auto configuration in the `auto-configuration` submodule.

The first test `AutoConfigSpec` tests to ensure that the default value is used.

The second test `AutoConfigOverrideSpec` ensures that the configuration override works properly.

See how to test below.

### Build and Test the Auto Configuration

    ./gradlew build

### Execute

	./gradlew application:bootRun


Curl or hit `http://localhost:8080/getdata` in your browser.
