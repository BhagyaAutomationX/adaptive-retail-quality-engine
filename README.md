# Adaptive Retail Quality Engine

Enterprise hybrid automation framework designed for validating retail business workflows across UI, API, and database layers using Selenium WebDriver, REST Assured, JDBC, Java, TestNG, and Maven.

---

# Project Overview

Adaptive Retail Quality Engine is a workflow-driven automation framework developed to simulate real-world retail quality engineering processes. The framework integrates UI automation, API validation, reusable utilities, retry handling, configurable execution setup, and database verification into a scalable automation architecture.

The project was designed with maintainability, reusable components, and workflow-based validations instead of basic tutorial-style automation implementation.

---

# Key Capabilities

* Selenium WebDriver UI Automation
* REST Assured API Validation
* JDBC Database Verification
* Cross Browser Execution Support
* Retry Handling for Failed Executions
* Screenshot Capture Utility
* Workflow-Based Automation Design
* Reusable Utility Components
* Configurable Execution Environment
* Maven Dependency Management
* TestNG Suite Execution

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

| Component            | Technology         |
| -------------------- | ------------------ |
| Programming Language | Java               |
| UI Automation        | Selenium WebDriver |
| API Automation       | REST Assured       |
| Framework            | TestNG             |
| Build Tool           | Maven              |
| Database Validation  | JDBC + MySQL       |
| Browser Management   | WebDriverManager   |
| IDE                  | Eclipse IDE        |

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
Retry & Logging Layer
↓
Execution & Reporting Layer
```

---

# Execution Steps

## Clone Repository

```bash
git clone https://github.com/your-username/adaptive-retail-quality-engine.git
```

---

## Install Dependencies

```bash
mvn clean install
```

---

## Execute Automation Suite

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

Framework currently supports:

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

# Engineering Highlights

* Workflow-driven automation design
* Reusable browser lifecycle management
* API + UI + DB validation integration
* Maintainable automation structure
* Retry orchestration handling
* Configurable execution setup
* Human-readable workflow implementation

---

# Planned Enhancements

* Extent Reports Integration
* GitHub Actions Pipeline
* Jenkins Integration
* Parallel Execution
* Excel Data Provider
* Docker Execution
* AI Self-Healing Locator Engine

---

# Author

Bhagya Shastrakar

Automation QA Engineer | Selenium | REST Assured | Hybrid Automation Framework Development
