package com.pangkeynath.kafka_demo.config;

import com.pangkeynath.kafka_demo.payload.Notification;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic myTopic() {
        return TopicBuilder
                .name("mytopic")
                .build();
    }

}
