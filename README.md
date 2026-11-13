# DevAssist AI

A project-based learning application for building production-quality AI features in Java with Spring Boot, Spring AI, and a locally hosted Ollama model.

## Overview

DevAssist AI starts with fundamental building blocks and progresses through advanced AI concepts:

1. **Lesson 1:** REST chat endpoint and Java code explainer
2. **Lesson 2:** Prompt templates, system messages, and generation options
3. **Lesson 3:** Structured outputs using Java records
4. **Lesson 4:** Conversation history and memory
5. **Lesson 5:** RAG with embeddings and PostgreSQL/pgvector
6. **Lesson 6:** Tool calling
7. **Lesson 7:** MCP clients and servers
8. **Lesson 8:** Agent workflows and approval boundaries
9. **Lesson 9:** Testing, evaluation, and observability
10. **Lesson 10:** Production architecture and deployment

## Tech Stack

- **Java 21+** — Modern Java features including records
- **Spring Boot 4.x** — Application framework
- **Spring AI 2.x** — AI/ML integration library
- **Maven** — Build tool
- **Ollama** — Local model hosting (default: `llama3.2` at `http://localhost:11434`)
- **JUnit 5 & Mockito** — Testing

## Getting Started

### Prerequisites

- Java 21 or later
- Maven 3.8+
- Ollama running locally with `llama3.2` model

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/C0d3N1nJ4/spring-ai.git
   cd spring-ai
   ```

2. Ensure Ollama is running:
   ```bash
   ollama serve
   ```

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The application will start on `http://localhost:8080`.

### API Endpoints

- `POST /api/v1/chat` — Chat with the AI model
  - Request: `{ "message": "Your question here" }`
  - Response: `{ "answer": "AI response" }`

- `POST /api/v1/code/explain` — Explain Java code
  - Request: `{ "code": "Java code snippet" }`
  - Response: `{ "explanation": "...", "language": "Java" }`

## Running Tests

```bash
./mvnw test
```

## Project Structure

```
src/
├── main/java/dev/naiomi/devassist/
│   ├── controller/     # REST endpoints
│   ├── service/        # Business logic & AI interactions
│   ├── dto/            # Request/response records
│   ├── config/         # Spring configuration
│   └── exception/      # Error handling
├── main/resources/
│   └── application.yml # Configuration
└── test/java/          # Unit & integration tests
```

## Architecture

- **Controllers** handle HTTP concerns and delegate to services
- **Services** contain business logic and Spring AI interactions
- **DTOs** are represented as Java records for type safety
- Constructor injection is preferred throughout
- Spring AI `ChatClient` is the primary API for model interactions

## Configuration

The application is configured via `application.yml`. Default settings connect to Ollama at `http://localhost:11434` using the `llama3.2` model.

## Learning Resources

Each lesson builds on previous concepts with practical, production-oriented examples:
- Unit tests mock AI boundaries for deterministic testing
- Live integration tests are optional and explicitly opt-in
- Focus on realistic error handling and validation
- Security and privacy best practices throughout

## License

This project is part of a learning curriculum.