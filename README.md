Demo Flight Management System
Introduction
Welcome to the Demo Flight Management System, an advanced application designed for managing and tracking flight and airport information. This system, built on Spring Boot, showcases the power of REST APIs in facilitating flight-related operations, enhanced with security features for authenticated access.

Features
Airport and Flight Management
Airport Management: Manage airport information with functionalities to add and retrieve airport details.
Flight Management: Create and list flight details, including departure and arrival locations, dates, and pricing.
Authentication System
The system is secured with Spring Security, requiring users to authenticate before accessing the API endpoints. This ensures that only authorized users can perform operations within the application.

Search API
A specialized search API endpoint allows users to query flights based on departure location, arrival location, departure date, and optional return date. The search functionality supports both one-way and round-trip flights:

For one-way flights, only the departure date is considered, and a single flight information is returned.
For round-trip flights, both departure and return dates are considered, and two flight informations are provided, one for each leg of the trip.
This feature ensures users can efficiently find flights that match their specific travel requirements.

API Endpoints
/Havaalani: For airport management, supporting GET and POST requests.
/Ucuslar: For flight details, supporting GET requests.
/search: For querying flights based on specific criteria, supporting customized search functionality for one-way and round-trip flights.
Getting Started
To get the project up and running on your local machine:

Clone the repository.
Open the project in your preferred IDE.
Ensure Maven and JDK 11+ are installed.
Run DemoApplication as a Java application.
Access the application at localhost:8080. Use Postman or similar tools to interact with the APIs.
Note on Swagger Documentation
Due to time constraints, Swagger documentation for the API endpoints is not included at this stage. We plan to integrate comprehensive API documentation in the near future to enhance developer experience and facilitate API interaction.

Authentication Details
Before accessing the APIs, users must authenticate themselves. The authentication system is built using Spring Boot's security starter. Detailed instructions on how to authenticate will be provided in the future documentation.

Contributing
Contributions to the project are highly encouraged. Please fork the repo and submit pull requests with your changes for review.

License
This project is licensed under the MIT License - see the LICENSE file for more details.
