# POM Java Project

## Description
This project implements the Page Object Model (POM) design pattern for a Java-based application. It is structured to facilitate easy maintenance and scalability of test automation scripts.

## Folder Structure
```
pom-java-project
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── example
│   │   │   │       ├── mappings
│   │   │   │       │   └── HomeMapping.java
│   │   │   │       ├── pages
│   │   │   │       │   └── HomePage.java
│   │   └── resources
│   │       └── config.properties
│   ├── test
│       ├── java
│       │   ├── com
│       │   │   └── example
│       │   │       ├── runner
│       │   │       │   └── TestRunner.java
│       │   │       └── setup
│       │   │       |   └── DriverManager.java
│       │   │       |   └── TestContext.java
│       │   │       └── stepdefinitions
│       │   │       |   └── Hooks.java
│       │   │       |   └── HomeSteps.java
│       │   │       └── testdata
│       │   │           └── TestData.java
│       └── resources
│           └── features
|           |    └── home.feature
│           └── junit-platform.properties
│           └── test-config.properties
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**: 
   ```
   git clone <repository-url>
   ```
2. **Navigate to the project directory**:
   ```
   cd pom-java-project
   ```
3. **Build the project**:
   ```
   mvn clean install
   ```
4. **Run the tests**:
   ```
   mvn test
   ```

## Usage
- The project uses Maven for dependency management and build automation.
- Test cases are located in the `src/test/java/com/example/tests` directory.
- Page objects are defined in the `src/main/java/com/example/pages` directory.

## Contributing
Contributions are welcome! Please create a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

WIP