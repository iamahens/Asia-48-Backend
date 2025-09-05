# Docker Setup for Asia48 Backend

This document provides instructions for running the Asia48 Backend application using Docker.

## Prerequisites

- Docker Desktop installed and running
- Docker Compose (included with Docker Desktop)

## Quick Start

1. **Build and start all services:**
   ```bash
   docker-compose up --build
   ```

2. **Start services in detached mode (background):**
   ```bash
   docker-compose up -d --build
   ```

3. **View logs:**
   ```bash
   # All services
   docker-compose logs -f
   
   # Specific service
   docker-compose logs -f app
   docker-compose logs -f mysql
   ```

4. **Stop services:**
   ```bash
   docker-compose down
   ```

5. **Stop services and remove volumes (WARNING: This will delete database data):**
   ```bash
   docker-compose down -v
   ```

## Services

### Application (Spring Boot)
- **Port:** 8080
- **URL:** http://localhost:8080
- **Health Check:** http://localhost:8080/actuator/health

### MySQL Database
- **Port:** 3306
- **Database:** asia48db
- **Username:** asia48user
- **Password:** asia48password
- **Root Password:** rootpassword

## Environment Variables

The following environment variables are configured in docker-compose.yml:

### Database Configuration
- `SPRING_DATASOURCE_URL`
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `SPRING_DATASOURCE_DRIVER_CLASS_NAME`

### JPA/Hibernate Configuration
- `SPRING_JPA_HIBERNATE_DDL_AUTO=update`
- `SPRING_JPA_SHOW_SQL=true`
- `SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT`

### Application Configuration
- `SPRING_PROFILES_ACTIVE=docker`
- `JWT_SECRET` (modify for production)
- `JWT_EXPIRATION`

## Development Workflow

### Building Only the Application
```bash
docker build -t asia48-backend .
```

### Running Only the Application (assuming MySQL is running elsewhere)
```bash
docker run -p 8080:8080 \
  -e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/asia48db \
  -e SPRING_DATASOURCE_USERNAME=asia48user \
  -e SPRING_DATASOURCE_PASSWORD=asia48password \
  asia48-backend
```

### Accessing the Database
```bash
# Connect to MySQL container
docker-compose exec mysql mysql -u asia48user -p asia48db

# Or using root user
docker-compose exec mysql mysql -u root -p
```

## Troubleshooting

### Application won't start
1. Check if MySQL is healthy:
   ```bash
   docker-compose ps
   ```

2. Check application logs:
   ```bash
   docker-compose logs app
   ```

### Database connection issues
1. Ensure MySQL container is running and healthy
2. Check network connectivity between containers
3. Verify database credentials in docker-compose.yml

### Port conflicts
If ports 8080 or 3306 are already in use, modify the port mappings in docker-compose.yml:
```yaml
ports:
  - "8081:8080"  # Change external port to 8081
```

## Production Considerations

Before deploying to production:

1. **Change default passwords** in docker-compose.yml
2. **Set secure JWT_SECRET** environment variable
3. **Use Docker secrets** for sensitive data
4. **Configure proper logging** and monitoring
5. **Set up backup strategy** for MySQL data
6. **Use specific image tags** instead of 'latest'
7. **Configure resource limits** for containers

## File Structure

```
.
├── Dockerfile              # Multi-stage build for Spring Boot app
├── docker-compose.yml      # Complete stack definition
├── .dockerignore          # Files to exclude from Docker build
├── init.sql               # Database initialization script
└── DOCKER_README.md       # This file
```