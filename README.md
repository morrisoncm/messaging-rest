### Messaging-Rest

Sample Gradle Spring Boot Rest API with Junit 5.

### Workspace setup

- [Download java](https://jdk.java.net/archive/)
- [Configuring Java](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html)
- [Download Eclipse](https://www.eclipse.org/downloads/packages/)
- [Visual Studio Code](https://code.visualstudio.com/docs/java/java-springboot)
- [Download and Install Gradle](https://docs.gradle.org/current/userguide/installation.html)
- [Download and install Postman](https://www.getpostman.com/downloads/)

### Spring Reference

- [Spring Getting Started Guides](https://spring.io/guides#getting-started-guides)
- [Spring Topical Guides](https://spring.io/guides#topical-guides)
- [Spring Tutorials](https://spring.io/guides#tutorials)
- [Gradle Guildes](https://gradle.org/guides/)

### Running the application

- Clone or download the project
- To run the application from Terminal / Command Prompt
- Change directory to the project root directory and type **gradle bootRun**
- To run the application inside Eclipse
- The starting point is Application.java
- Right click the Application.java and select Run As ->Java Application

### Testing the application

- The test scripts are under the project root directory in the postman folder
- Run in Terminal to test **curl --noproxy '*' --location --request POST 'http://127.0.0.1:8080/demo/greetings'
  --header 'Content-Type: application/json' --data-raw '{"firstname": "Clinton", "lastname": "Morrison"}'**


