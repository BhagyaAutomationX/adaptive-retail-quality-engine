# Adaptive Retail Quality Engine

Enterprise-grade hybrid automation framework designed for validating scalable retail workflows across UI, API, and database layers using Selenium WebDriver, REST Assured, JDBC, Java, TestNG, and Maven.

---

# Project Overview

Adaptive Retail Quality Engine is a workflow-driven automation framework developed to simulate real-world enterprise retail quality engineering processes. The framework integrates UI automation, API validation, database verification, retry orchestration, reusable utilities, and scalable browser management into a maintainable automation architecture.

This framework is designed following enterprise engineering practices instead of tutorial-style automation implementation.

---

# Key Capabilities

* Selenium WebDriver UI Automation
* REST Assured API Validation
* JDBC Database Validation
* Cross Browser Execution
* Retry Handling for Unstable Tests
* Screenshot Capture for Failed Executions
* Workflow-Driven Test Architecture
* Reusable Utility Components
* Configurable Execution Environment
* Maven Dependency Management
* TestNG Suite Management

---

# Business Workflows Automated

* Employee Authentication Workflow
* Invalid Credential Validation
* Employee Dashboard Accessibility
* Customer Service API Validation
* Retail Checkout Workflow
* Inventory Allocation Validation

---

# Tech Stack

| Component           | Technology               |
| ------------------- | ------------------------ |
| Language            | Java                     |
| UI Automation       | Selenium WebDriver       |
| API Automation      | REST Assured             |
| Testing Framework   | TestNG                   |
| Build Tool          | Maven                    |
| Database Validation | JDBC + MySQL             |
| Browser Management  | WebDriverManager         |
| CI/CD Ready         | GitHub Actions + Jenkins |
| IDE                 | Eclipse IDE              |

---

# Project Structure

```text
adaptive-retail-quality-engine
│
├── src/test/java
│
├── core
│      DriverManager.java
│
├── pages
│      AuthenticationPage.java
│      DashboardPage.java
│
├── tests
│      AuthenticationWorkflowTest.java
│      InvalidLoginValidationTest.java
│      EmployeeDashboardValidationTest.java
│      CustomerServiceValidationTest.java
│      RetailCheckoutWorkflowTest.java
│      InventoryAllocationValidationTest.java
│
├── utilities
│      ConfigReader.java
│      ScreenshotManager.java
│      BrowserSessionLogger.java
│      EnvironmentManager.java
│      DatabaseValidator.java
│
├── listeners
│      RetryHandler.java
│
├── ExecutionReports
├── ExecutionScreenshots
├── logs
├── testdata
├── ci-cd
│
├── src/test/resources
│      config.properties
│
├── pom.xml
├── testng.xml
└── README.md
```

---

# Automation Architecture

```text
UI Automation Layer
↓
API Validation Layer
↓
Database Validation Layer
↓
Reporting & Retry Layer
↓
CI/CD Execution Layer
```

---

# Execution Steps

## Clone Repository

```bash
git clone https://github.com/your-username/adaptive-retail-quality-engine.git
```

---

## Import Project

Import as Maven Project in Eclipse IDE.

---

## Install Dependencies

```bash
mvn clean install
```

---

## Execute Test Suite

```bash
mvn test
```

OR execute:

```text
testng.xml
```

using TestNG Suite execution.

---

# Cross Browser Support

Framework supports:

* Chrome
* Firefox
* Edge

Configure browser inside:

```text
config.properties
```

Example:

```properties
browser=chrome
```

---

# Reporting

Framework supports:

* Execution screenshots
* Retry handling
* Console execution logging
* Workflow execution tracking

Execution evidence is automatically captured during automation runs.

---

# CI/CD Integration

The framework is CI/CD ready and supports:

* GitHub Actions
* Jenkins Pipeline Integration

---

# Engineering Highlights

* Enterprise naming conventions
* Workflow-driven automation design
* Maintainable framework architecture
* Reusable utility implementation
* Scalable browser lifecycle management
* Integrated API + UI + DB validation
* Human-engineered automation structure

---

# Future Enhancements

* Extent Reports Integration
* Docker Execution
* Parallel Test Execution
* Excel Data Provider
* AI Self-Healing Locator Engine
* OpenAI-based Failure Analysis
* Allure Reporting

---

# Author

Bhagya Shastrakar

Automation QA Engineer | Selenium | REST Assured | Java | Hybrid Automation Frameworks | AI-Driven Testing
