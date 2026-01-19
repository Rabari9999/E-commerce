# E-commerce Backend

A Spring Boot-based e-commerce backend application.

## Description

This is the backend API for an e-commerce platform. It provides RESTful endpoints for managing products, shopping carts, orders, and payment processing using Razorpay.

## Technologies Used

- **Java**: 21
- **Spring Boot**: 4.0.1
- **Database**: MongoDB
- **Authentication**: JWT (JSON Web Tokens)
- **Payment Gateway**: Razorpay
- **Build Tool**: Maven

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 21 or higher
- Maven 3.6+
- MongoDB

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Rabari9999/E-commerce.git
   cd ecommerce-backend
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Configuration

Update the `application.properties` or `application.yml` file with your MongoDB connection details and Razorpay credentials.

Example:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/ecommerce
razorpay.key_id=your_razorpay_key_id
razorpay.key_secret=your_razorpay_key_secret
```

## Running the Application

Start the application using Maven:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

The API provides the following main endpoints:

- **Products**: `/api/products` - CRUD operations for products
- **Cart**: `/api/cart` - Manage shopping cart items
- **Orders**: `/api/orders` - Handle order creation and management
- **Payments**: `/api/payments` - Process payments via Razorpay
- **Payment Webhooks**: `/api/webhooks` - Handle Razorpay webhooks

## Project Structure

```
src/
├── main/java/com/example/demo/
│   ├── EcommerceApplication.java
│   ├── controllers/          # REST controllers
│   ├── services/             # Business logic services
│   ├── repository/           # Data access layer
│   ├── models/               # Entity models
│   ├── dto/                  # Data transfer objects
│   ├── config/               # Configuration classes
│   └── client/               # External API clients
└── test/                     # Unit tests
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License.