package com.pangkeynath.kafka_demo.producer;

import com.pangkeynath.kafka_demo.payload.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {
    private final KafkaTemplate<String, Notification> kafkaTemplate;

    public void sendMessage(Notification notification) {
        Message<Notification> message = MessageBuilder
                .withPayload(notification)
                .setHeader(KafkaHeaders.TOPIC, "mytopic")
                .build();

        kafkaTemplate.send(message);
    }
}
