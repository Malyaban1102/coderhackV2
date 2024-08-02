# Overview

A RESTful API service built with Spring Boot to manage the leaderboard for a coding platform. The application uses MongoDB to persist user data.

# Features
1. User Registration: Register a new user with a unique User ID and Username.
2. Update Score: Update the score of a specific user.
3. Badge Awarding: Award badges to users based on their scores.
   . 1 <= Score < 30 -> Code Ninja
   . 30 <= Score < 60 -> Code Champ
   . 60 <= Score <= 100 -> Code Master
4. User Retrieval: Retrieve a list of all registered users.
5. User Deletion: Deregister a specific user from the contest.

# Installation and Usage

Prerequisites-
. Java 17 or higher
. MongoDB
. Postman for API testing

# Getting started

1. Clone the repository.
2. Navigate to the project directory: cd coderhackV2.
3. Build and run the application using Gradle: ./gradlew bootrun

# API endpoints

1. GET /users - Retrieve a list of all registered users
2. GET /users/{userId} - Retrieve the details of a specific user
3. POST /users - Register a new user to the contest
4. PUT /users/{userId} - Update the score of a specific user
5. DELETE /users/{userId} - Deregister a specific user from the contest

# API Testing

For testing the API endpoints, you can use the following link - https://web.postman.co/workspace/My-Workspace~abb9d005-9eb1-4cbd-8076-ffb1328145e2/collection/36793359-a5be77ce-7a2d-4e10-bc14-22df40e152ec?action=share&source=copy-link&creator=36793359

   

   

