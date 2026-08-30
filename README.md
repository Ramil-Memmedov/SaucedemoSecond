# SauceDemo UI Automation Framework

## 📌 Project Overview

This project is a UI test automation framework developed for testing the [SauceDemo](https://www.saucedemo.com/) web application.

The framework is designed to automate critical user scenarios such as login validation and shopping cart functionality using **Java, Selenium WebDriver, Cucumber, and Maven**.

The project follows the **Page Object Model (POM)** design pattern to improve code maintainability, reusability, and readability.

---

## 🛠️ Technologies & Tools

* **Java 17**
* **Selenium WebDriver 4.29.0**
* **Cucumber 7.15.0**
* **JUnit 4**
* **TestNG**
* **Maven**
* **WebDriverManager**
* **Allure Report**
* **SLF4J / Logback**
* **Git & GitHub**
* **Page Object Model (POM)**
* **BDD (Behavior Driven Development)**

The project dependencies and build configuration are managed through Maven.

---

## 🏗️ Project Structure

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
│       │   └── tests
│       │
│       └── resources
│           └── features
│               ├── login.feature
│               └── cart.feature
│
├── allure-report
├── allure-results
├── pom.xml
└── README.md
```

The project separates page objects, test logic, runners, and Cucumber feature files into dedicated packages/directories.

---

## 🧪 Automated Test Scenarios

### 🔐 Login Tests

The following login scenarios are covered:

* Successful login with valid credentials
* Login with an invalid password
* Login with a locked-out user
* Verification of successful redirection to the Inventory page
* Verification of login error messages

These scenarios are written using Cucumber/Gherkin syntax.

### 🛒 Cart Tests

The project also includes tests for shopping cart functionality:

* Verify that the user can open the Cart page
* Verify that the Cart page is displayed
* Verify that the expected product is present in the cart

These scenarios are implemented as Cucumber feature files.

---

## 🧩 Framework Design

### Page Object Model

The framework uses the **Page Object Model (POM)** design pattern.

Each web page has a dedicated page class containing:

* Web element locators
* Page-specific actions
* Reusable methods

Current page objects include:

* `BasePage`
* `LoginPage`
* `CartPage`

This approach helps reduce code duplication and makes the automation framework easier to maintain.

---

## 🥒 BDD with Cucumber

Test scenarios are written in **Gherkin syntax** using Cucumber.

Example:

```gherkin
Scenario: Successful login
  Given User is on Login page
  When User enters username "standard_user"
  And User enters password "secret_sauce"
  And User clicks Login button
  Then User should be redirected to Inventory page
```

Using BDD allows test scenarios to be written in a human-readable format and makes them easier to understand for both technical and non-technical team members.

---

## 📊 Test Reporting

The project is configured with **Allure** for test reporting.

Allure provides detailed information about test execution and helps identify passed and failed scenarios.

The project contains:

```text
allure-results/
allure-report/
```

The Maven configuration also includes the Allure Cucumber integration.

---

## ▶️ How to Run the Tests

### 1. Clone the repository

```bash
git clone https://github.com/Ramil-Memmedov/SaucedemoSecond.git
```

### 2. Navigate to the project

```bash
cd SaucedemoSecond
```

### 3. Run the tests with Maven

```bash
mvn clean test
```

### 4. Generate Allure Report

If Allure CLI is installed:

```bash
allure serve target/allure-results
```

---

## 🎯 Project Goals

The main goals of this project are:

* Practice UI test automation
* Build a maintainable automation framework
* Apply Page Object Model
* Implement BDD with Cucumber
* Automate positive and negative test scenarios
* Generate test execution reports
* Improve Java and Selenium automation skills

---

## 👨‍💻 Author

**Ramil Məmmədov**

Junior QA Automation Engineer

* GitHub: https://github.com/Ramil-Memmedov
* LinkedIn: https://www.linkedin.com/in/ramil-memmedov-150926316/

---

## 📌 Repository

[View the project on GitHub](https://github.com/Ramil-Memmedov/SaucedemoSecond)
