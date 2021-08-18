package com.tcs.example.springbootKafkaConsumer.listener;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "employer", groupId = "my-appnewcons")
    public void consume(JsonNode message){
        System.out.println(message);
    }
}
