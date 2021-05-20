package com.example.kafka_poc.message;

import com.example.kafka_poc.model.DipgoModel;
import javafx.application.Application;
import org.apache.juli.logging.Log;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class DipgoMessageProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(DipgoMessageProducer.class);

    @Value("${app.kafka.producer.topic.openacc}")
    private String TOPIC_OPENACCOUNT;


    @Autowired
    private KafkaTemplate<String, DipgoModel> kafkaTemplate;


    private ProducerListener<String, DipgoModel> producerListener(){
        return new ProducerListener<String, DipgoModel>() {
            @Override
            public void onSuccess(
                    ProducerRecord<String, DipgoModel> producerRecord,
                    RecordMetadata recordMetadata) {

                LOGGER.info("ACK from ProducerListener message: {} offset:  {}",
                        producerRecord.value(),
                        recordMetadata.offset());
            }

            @Override
            public void onError(ProducerRecord<String, DipgoModel> producerRecord, @Nullable RecordMetadata recordMetadata, Exception exception) {
                LOGGER.info("ACK from ProducerListener ERROR Message: {} offset:  {}",
                        exception.getMessage(),
                        recordMetadata.offset());
            }

        };
    }

    public Object sendOpenAccount(DipgoModel payload) {
        kafkaTemplate.setProducerListener(producerListener());

        //synchronous
        try {
            kafkaTemplate.send(TOPIC_OPENACCOUNT, payload).get(); //use .get() to synchronous
            LOGGER.info("synchronous send topic success");

        }catch(ExecutionException | InterruptedException e){
            LOGGER.error("Execution/Interrupted Exception and the details is {}", e.getMessage());
        }catch(Exception e) {
            LOGGER.error("Execution sending the message and the details are {}", e.getMessage());
        }

        /* Asynchronous
        ListenableFuture<SendResult<String, DipgoModel>> future = kafkaTemplate.send(TOPIC_OPENACCOUNT, payload);
        future.addCallback(new ListenableFutureCallback<SendResult<String, DipgoModel>>() {

            @Override
            public void onSuccess(SendResult<String, DipgoModel> result) {
                LOGGER.info("Sent message=[] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                LOGGER.info("Unable to send message=[] due to : " + ex.getMessage());
            }
        });*/

        return payload;

    }

}
