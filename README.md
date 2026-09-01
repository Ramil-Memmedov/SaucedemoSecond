# SauceDemo UI Automation Framework

## Project Overview

This project is a UI test automation framework developed for testing the [SauceDemo](https://www.saucedemo.com/) web application.

The framework automates key user scenarios including login validation and shopping cart functionality using **Java, Selenium WebDriver, Cucumber, JUnit, TestNG, Maven, and Allure**.

The project follows the **Page Object Model (POM)** design pattern to improve test maintainability, reusability, and readability.

---

## Technologies & Tools

* **Java 17**
* **Selenium WebDriver 4.29.0**
* **Cucumber 7.15.0**
* **JUnit 4.13.2**
* **TestNG 7.12.0**
* **Maven**
* **WebDriverManager 5.7.0**
* **Allure Report 2.29.1**
* **SLF4J 2.0.16**
* **Logback 1.5.12**
* **Git & GitHub**
* **Page Object Model (POM)**
* **BDD / Gherkin**

Project dependencies and build configuration are managed using Maven.

---

## Project Structure

```text
SaucedemoSecond
│
├── src
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── BasePage.java
│   │           ├── LoginPage.java
│   │           └── CartPage.java
│   │
│   └── test
│       ├── java
│       │   ├── runners
│       │   │   └── TestRunner.java
│       │   │
│       │   └── tests
│       │       ├── LoginTest.java
│       │       └── CartTest.java
│       │
│       └── resources
│           └── features
│               ├── login.feature
│               └── cart.feature
│
├── pom.xml
├── .gitignore
└── README.md
```

The framework separates page objects, test classes, Cucumber feature files, and the test runner into dedicated directories.

---

## Automated Test Scenarios

### Login

The login automation covers:

* Successful login with valid credentials
* Login with an invalid password
* Login with a locked-out user
* Verification of successful navigation to the Inventory page
* Verification of login error messages

The scenarios are described using **Cucumber/Gherkin** syntax.

### Shopping Cart

The cart automation covers:

* Opening the Cart page
* Verifying that the Cart page is displayed
* Verifying that the expected product is present in the cart

---

## Framework Design

### Page Object Model

The framework follows the **Page Object Model (POM)** design pattern.

Page-specific classes contain:

* Web element locators
* Page-specific actions
* Reusable methods

Current page objects include:

* `BasePage`
* `LoginPage`
* `CartPage`

Separating page objects from test logic improves code readability and makes the framework easier to maintain and extend.

---

## BDD with Cucumber

Test scenarios are written using **Gherkin syntax** and executed with Cucumber.

Example:

```gherkin
Scenario: Successful login
  Given User is on Login page
  When User enters username "standard_user"
  And User enters password "secret_sauce"
  And User clicks Login button
  Then User should be redirected to Inventory page
```

BDD provides a human-readable way to describe expected application behavior and test scenarios.

---

## Test Reporting

The project is configured with **Allure Report** for test execution reporting.

Allure results are generated in the Maven `target` directory and are excluded from version control using `.gitignore`.

After running the tests, the results are available in:

```text
target/allure-results
```

To view the report:

```bash
allure serve target/allure-results
```

Make sure Allure CLI is installed and configured in your system PATH.

---

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Ramil-Memmedov/SaucedemoSecond.git
```

### 2. Navigate to the project directory

```bash
cd SaucedemoSecond
```

### 3. Run the tests

```bash
mvn clean test
```

### 4. Open the Allure Report

After the tests finish:

```bash
allure serve target/allure-results
```

---

## Project Goals

The main goals of this project are:

* Practice UI test automation with Selenium WebDriver
* Build a maintainable automation framework
* Apply the Page Object Model design pattern
* Implement BDD using Cucumber and Gherkin
* Automate positive and negative test scenarios
* Work with Maven-based automation projects
* Generate and analyze test execution reports
* Practice Git and GitHub version control

---

## Author

**Ramil Məmmədov**

Junior QA Automation Engineer

* GitHub: https://github.com/Ramil-Memmedov
* LinkedIn: https://www.linkedin.com/in/ramil-memmedov-150926316/

---

## Repository

[View this project on GitHub](https://github.com/Ramil-Memmedov/SaucedemoSecond)
