# microservices-platform (Platform Architecture Repository)

This repository is structured as an **enterprise microservices platform** with separate layers for infrastructure, business services, shared libraries, messaging, observability, deployment, CI/CD, and docs.

## Structure

```
microservices-platform
├── infrastructure
│   ├── eureka-server
│   ├── config-server
│   └── api-gateway
├── services
│   ├── auth-service
│   ├── user-service
│   ├── order-service
│   ├── notification-service
│   └── ai-assistant-service
├── common-library
├── messaging
│   └── kafka
├── observability
│   ├── zipkin
│   ├── prometheus
│   └── grafana
├── deployment
│   ├── docker
│   └── kubernetes
├── ci-cd
│   ├── jenkins
│   └── github-actions
└── docs
```

## Build

From repo root:

```bash
mvn -DskipTests package
```

## Run locally with Docker (platform stack)

1) Build jars:

```bash
mvn -DskipTests package
```

2) Start the ecosystem:

```bash
cd deployment/docker
docker compose up --build
```

### Useful endpoints

- **Eureka**: `http://localhost:8767`
- **Config Server**: `http://localhost:8885`
- **API Gateway**: `http://localhost:8881`
- **Zipkin**: `http://localhost:9411`
- **Prometheus**: `http://localhost:9090`
- **Grafana**: `http://localhost:3000` (default grafana credentials)

## Docs

See `docs/architecture.md`.

