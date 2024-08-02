# Springboot Kafka Demonstration
This repository contains three projects demonstrating the use of Apache Kafka with Spring Boot. It starts with a basic demo, followed by separate producer and consumer application.

## Projects Overview
### Kafka Demo
- **Purpose**: Initial demonstration of Kafka setup with Spring Boot.
- Configures Kafka producer and consumer.
- Defines a Notification payload class for JSON messages.
- Includes producers (KafkaJsonProducer and KafkaProducer) and consumers (KafkaConsumer) for a topic named "mytopic".
- REST API endpoints to send messages to Kafka.

### Producer App
- **Purpose**: Fetches data from Wikimedia API and publishes it to Kafka.
- Sends messages to "wikimedia-stream" topic.
- Uses WebClient to fetch and publish recent changes from Wikimedia.

### Consumer App
- **Purpose**: Consumes messages from "wikimedia-stream" Kafka topic.
- Listens to messages from "wikimedia-stream".
- Logs consumed messages.

## Usage
- To use these projects, start by running Kafka locally.
- Begin with the Kafka Demo project to understand the basics of Kafka integration with Spring Boot. Use the provided REST API endpoints to send test messages.
- Then, move on to the Producer App. Start the application and hit the provided API endpoint to fetch real-time data from Wikimedia and publish it to the "wikimedia-stream" topic.
- In the same time, run the Consumer App to listen for and log messages from the same topic.
