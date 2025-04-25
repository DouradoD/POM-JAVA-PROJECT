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

## Running using Docker
## Running on Docker
1. Install the docker
2. Access the pytest-rest-api, in the same level of Dockerfile
   3. Run the docker command to create an image:
   ```
      docker build -t <image_name> .

      ex: docker build -t pom-java-p .
   ```
   Command to check the images: docker images
    ```
        docker images
   ```
   4. Run the container:
   ```
      docker run --rm <image_name>
      
      ex: docker run --rm pytest-rest
   ```
   Command to check the containers running
   ```
   docker ps
   ```
3. (Optional) Mount a volume to access the HTML report on your host machine:

   1. Create a package in the root with the name reports;
   2. Replace the $(pwd) or pwd for your project pash:
      2. Ex: pwd -> C:/Users/YOUR_USER/project/pytest-rest-api
```bash
     # 1. Stop everything
docker compose down

# 2. Rebuild with fixed Dockerfile
docker compose build --no-cache 
or 
docker compose build


# 3. Start grid services
docker compose up -d selenium-hub session_browser_one session_browser_two

# 4. Verify grid is ready
docker compose run --rm project-img curl -v http://selenium-hub:4444/wd/hub/status

# 5. Run tests (finally!)
docker compose -f docker-compose.yml run -v --rm project-img mvn clean test -DexecutionMode=grid -DgridUrl=http://selenium-hub:4444/wd/hub -X
```
- -v <YOUR_PROJECT_PATH>/reports:/usr/src/app/reports: Mounts the reports directory on your host to /usr/src/app/reports in the container.

- The HTML report will be saved in the reports directory on your host.

The .html will be stored inside the reports folder
## Usage
- The project uses Maven for dependency management and build automation.
- Test cases are located in the `src/test/java/com/example/tests` directory.
- Page objects are defined in the `src/main/java/com/example/pages` directory.

## Contributing
Contributions are welcome! Please create a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

WIP