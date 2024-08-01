package com.pangkeynath.kafka_demo.payload;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Notification {
    private int id;
    private String title;
    private String message;
    private String recipient;

}
