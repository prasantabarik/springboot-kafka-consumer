//package com.tcs.example.springbootKafkaConsumer.config;
//
//
//import com.fasterxml.jackson.databind.JsonNode;
////import com.tcs.example.springbootKafkaConsumer.model.User;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.config.SaslConfigs;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.apache.kafka.connect.json.JsonDeserializer;
//import org.apache.kafka.connect.json.JsonSerializer;
////import org.apache.kafka.streams.StreamsConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConfiguration {
//
//    @Value("${spring.kafka.consumer.bootstrap.servers}")
//    private String bootstrapServer;
//
//    @Bean
//    public ConsumerFactory consumerFactory(){
//
//        Map<String, Object> config = new HashMap<>();
//
////        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "wordcount-application");
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
////        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka.confluent.svc.cluster.local:9071");
//        config.put(ConsumerConfig.GROUP_ID_CONFIG, "my-app");
////        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//
//
//
//        return new DefaultKafkaConsumerFactory<>(config);
//
//    }
//
////    @Bean
////    public KafkaTemplate<String, JsonNode> kafkaTemplate(){
////        return new KafkaTemplate<String, JsonNode>(producerFactory());
////    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, JsonNode> kafkaListenerContainerFactory(){
//        ConcurrentKafkaListenerContainerFactory<String,JsonNode> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//}
// this is for testing purpose
