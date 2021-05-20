package com.example.kafka_poc.controller;

import com.example.kafka_poc.message.DipgoMessageProducer;
import com.example.kafka_poc.model.CddModel;
import com.example.kafka_poc.model.DipgoModel;
import com.example.kafka_poc.service.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private DipgoMessageProducer messageProducer;

    @PostMapping(value = "/dipgo/openaccount")
    public ResponseEntity<DipgoModel> sendOpenAccount(@RequestBody DipgoModel dg) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dg);
        LOGGER.info(json);
            //System.out.println(json);

        DipgoModel dg2 = (DipgoModel) messageProducer.sendOpenAccount(dg);
        LOGGER.info("---------------------- success --------------------");
        return ResponseEntity.status(HttpStatus.OK).body(dg2);
    }
}
