## Platform Architecture

### High-level diagram

```mermaid
flowchart TB
  Internet((Internet)) --> GW[API Gateway]
  GW --> AUTH[Auth Service]
  GW --> USER[User Service]
  GW --> ORDER[Order Service]
  ORDER --> K[(Kafka Event Bus)]
  USER --> K
  K --> NOTIF[Notification Service]
  NOTIF --> AI[AI Assistant Service]

  subgraph Infrastructure
    EUREKA[Eureka Server]
    CONFIG[Config Server]
  end

  AUTH -.register.-> EUREKA
  USER -.register.-> EUREKA
  ORDER -.register.-> EUREKA
  NOTIF -.register.-> EUREKA
  AI -.register.-> EUREKA
  GW -.register.-> EUREKA
  CONFIG -.register.-> EUREKA

  subgraph Observability
    ZIPKIN[Zipkin]
    PROM[Prometheus]
    GRAF[Grafana]
  end
```

### Notes

- **Service discovery**: `infrastructure/eureka-server`
- **Central configuration**: `infrastructure/config-server` reads configs from `infrastructure/config-repo`
- **Routing**: `infrastructure/api-gateway`
- **Messaging**: Kafka stack is defined in `deployment/docker/docker-compose.yml`
- **AI service**: `services/ai-assistant-service` is currently a stub and is intended to be upgraded to Spring AI + Ollama.

