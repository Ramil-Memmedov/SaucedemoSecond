# SauceDemo Test Automation Framework

## 📌 Project Overview

This project is a web UI test automation framework developed for testing the **SauceDemo** e-commerce application.

The framework is built using **Java, Selenium WebDriver, TestNG, Maven, Cucumber, and Allure** and follows the **Page Object Model (POM)** design pattern to improve code reusability, maintainability, and readability.

The project covers key user flows such as user authentication and shopping cart functionality.

---

## 🛠️ Tech Stack

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Cucumber**
* **Maven**
* **Page Object Model (POM)**
* **Allure Report**
* **Git & GitHub**
* **IntelliJ IDEA**

---

## 📂 Project Structure

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

---

## 🧪 Test Coverage

### 🔐 Login

* User login functionality
* Login scenarios using Cucumber feature files
* Validation of login behavior

### 🛒 Shopping Cart

* Adding products to the shopping cart
* Verifying cart functionality
* Cart-related test scenarios

---

## 🏗️ Framework Architecture

The project follows the **Page Object Model (POM)** design pattern.

Page-specific elements and actions are separated from test logic, making the framework easier to maintain and extend.

### Page Objects

* `BasePage` — common page functionality
* `LoginPage` — login page elements and actions
* `CartPage` — shopping cart elements and actions

### Test Layer

* `LoginTest` — login-related test scenarios
* `CartTest` — shopping cart test scenarios

### BDD Layer

Cucumber feature files are used to describe test scenarios in a readable format:

* `login.feature`
* `cart.feature`

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Ramil-Memmedov/SaucedemoSecond.git
```

### 2. Navigate to the project directory

```bash
cd SaucedemoSecond
```

### 3. Run the tests

Using Maven:

```bash
mvn clean test
```

---

## 📊 Test Reporting

The project uses **Allure Report** for test result visualization.

After test execution, Allure results can be generated and viewed using:

```bash
allure serve allure-results
```

---

## 🎯 Project Goals

The main goals of this project are:

* Practicing UI test automation with Selenium WebDriver
* Applying the Page Object Model design pattern
* Creating maintainable automated tests
* Working with TestNG and Cucumber
* Managing dependencies with Maven
* Generating test execution reports with Allure
* Using Git and GitHub for version control

---

## 👨‍💻 Author

**Ramil Məmmədov**

QA Automation Engineer — Junior

* GitHub: [Ramil-Memmedov](https://github.com/Ramil-Memmedov)
* LinkedIn: [Ramil Məmmədov](https://www.linkedin.com/in/ramil-memmedov-150926316/)
