package com.pangkeynathwikiped.producer.stream;
import com.pangkeynathwikiped.producer.producer.WikimediaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class WikimediaStreamConsumer {

    private final WebClient webClient;
    private final WikimediaProducer producer;

    public WikimediaStreamConsumer(WebClient.Builder webClientBuilder, WikimediaProducer producer) {
        // Initialize WebClient with the base URL for Wikimedia streaming service
        this.webClient = webClientBuilder
                .baseUrl("https://stream.wikimedia.org/v2")
                .build();
        // Assign the producer instance to the class field
        this.producer = producer;
    }

    public void consumeStreamAndPublish() {
        webClient.get()
                .uri("/stream/recentchange") // Specific endpoint for recent changes
                .retrieve()
                .bodyToFlux(String.class) // Convert response body to a Flux of strings (stream of data)
                .subscribe(producer::sendMessage); // Method reference: call sendMessage for each received message
    }
}
