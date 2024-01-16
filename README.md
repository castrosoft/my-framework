# My own automation framework

This project will serve as a automation template.

## Below, you can find a list of the utilized tools.

Make sure you have the following tools installed before getting started:

- [IntelliJ IDEA](https://www.jetbrains.com/idea/): Integrated Development Environment for Java.
- [Java](https://www.oracle.com/java/): The programming language used in the project.
- [Maven](https://maven.apache.org/): Dependency management and build tool.
- [Gherkin](https://cucumber.io/docs/gherkin/): Behavior specification language.
- [Cucumber](https://cucumber.io/): Test automation framework.
- [JUnit 5](https://junit.org/junit5/): Testing framework for Java.
- [SLF4J](https://www.slf4j.org/): Simple Logging Facade for Java, a logging framework.
- [Serenity](https://serenity-bdd.github.io/theserenitybook/latest/index.html): Library for BDD test automation.
- [Screenplay](https://serenity-bdd.github.io/theserenitybook/latest/screenplay.html): Design pattern for writing expressive tests.

## 1.   Prerequisites

Before running the project, make sure you have Java 8 installed on your system.

## 2.   Clone the project

To get started with this project, you can clone it to your local machine using the following command:

```bash
git clone https://github.com/castrosoft/my-framework.git
```

## 3.   Configuration

No special configuration is required for this project. You can open the project in your preferred development environment.

## 4.   Run tests

To run the project's tests, use Maven. Make sure you are in the project's root directory and run the following command:
```bash
mvn clean verify -Denvironment=chrome
```
This will compile the project, run the tests, and verify its integrity on Chrome browser.
However you can choose another browser (firefox or edge).

```bash
mvn clean verify -Denvironment=chrome -Dcucumber.filter.tags="@tag"
```
To run a specific feature's tag.


## 5.   Contribute

If you wish to contribute to this project, follow these steps:

1. Fork the project.
2. Create a new branch (git checkout -b feature/new-feature).
3. Make your changes and commit (git commit -am 'Add new feature').
4. Push the branch (git push origin feature/new-feature).
5. Open a pull request on GitHub.

   
   
   






