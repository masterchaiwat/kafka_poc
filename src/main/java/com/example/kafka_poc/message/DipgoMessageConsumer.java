package com.example.kafka_poc.message;

import com.example.kafka_poc.model.DipgoModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javafx.application.Application;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class DipgoMessageConsumer {


    private static final Logger LOGGER= LoggerFactory.getLogger(Application.class);

    /*@KafkaListener(topics = "KTB-EVENT-DIPGO-OPENACCOUNT", groupId = "producer-1")
    public void listen(ConsumerRecord<String, DipgoModel> cr) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(cr);
            LOGGER.info(json);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }*/

    //@KafkaListener(topics = "${app.kafka.producer.topic.openacc}", groupId = "producer-1")
    public void listen(DipgoModel cr) {
        String rawString = cr.getProfile().getFirstNameTh();
        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);

        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        LOGGER.info("=========================== consumer =========================");
        LOGGER.info(" ********** utf8 = " + utf8EncodedString);
        try {

            String json = mapper.writeValueAsString(cr);
            LOGGER.info(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
