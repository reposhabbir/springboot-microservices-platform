## Kafka (Messaging Layer)

This folder represents the **event-driven communication layer** of the platform.

### Local runtime

Kafka is provisioned via `deployment/docker/docker-compose.yml` using Bitnami Kafka + Zookeeper.

### Suggested topics (platform conventions)

- `user.created`
- `order.created`
- `notification.send`
- `logs.ingested`

