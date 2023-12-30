# Spring AI Project

This project includes an AI service developed using the Spring framework. In this project, text-based AI models are interacted with using the OpenAI API.

## Project Structure

The project consists of the following packages and classes:

- **com.yunusbagriyanik.springai.controller**: Contains the Spring AI Controller class.
    - `SpringAIController`: Defines API endpoints and handles requests.

- **com.yunusbagriyanik.springai.service**: Contains the Spring AI Service class.
    - `SpringAIService`: Includes methods for interacting with the AI model.

- **com.yunusbagriyanik.springai.util**: Contains utility classes.
    - `PromptUtils`: Includes text templates for communication with the AI model.

## How to Use

The project is structured as a Spring Boot application. Follow the steps below to run the project:

1. In the project directory, execute the following command to clean with Maven:

    ```bash
    mvn clean
    ```

2. Then, start the application using the following command:

    ```bash
    mvn spring-boot:run
    ```

3. After the application starts, you can make HTTP requests to the API endpoints as follows:

    - **Course Compass Request:**
      ```http
      GET http://localhost:8080/api/v1/course-compass?promptCreateCourse=YourCoursePrompt
      ```

    - **Book Recommendation Request:**
      ```http
      GET http://localhost:8080/api/v1/book-recommendation?category=YourCategory&year=YourYear
      ```