package com.example.kafka_poc.service;

import com.example.kafka_poc.message.DipgoMessageProducer;
import com.example.kafka_poc.model.CddModel;
import com.example.kafka_poc.model.DipgoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class KafkaService {

}

/*@Service
public class KafkaService {

    @Autowired
    private DipgoMessageProducer messageProducer;


    public DipgoModel sendDipgo(DipgoModel dg){
        return (DipgoModel) messageProducer.sendOpenAccount(dg);
    }



}*/
