package com.pangkeynath.kafka_demo.consumer;

import com.pangkeynath.kafka_demo.payload.Notification;
import lombok.experimental.PackagePrivate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {
//    @KafkaListener(topics = "mytopic", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from my Topic:: %s", msg));
    }

    @KafkaListener(topics = "mytopic", groupId = "myGroup")
    public void consumeJsonMsg(Notification notification) {
        log.info(format("Consuming the message from Topic : %s", notification.toString()));
    }

}
