package com.skripsi.IRSValidate.pubsub.listener;

import com.skripsi.IRSValidate.pubsub.schema.ValidateIRSSchema;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IRSValidateListener {
    @Qualifier("kafkaListenerContainerFactory")
    @KafkaListener(topics = "IRS_VALIDATE", groupId = "IRS-validator-consumer-1", containerFactory = "kafkaListenerContainerFactory")
    public void listenValidateIRS(@Payload ValidateIRSSchema validateIRSSchema, @Headers MessageHeaders headers) throws IOException {
        System.out.println("dapet : "+ validateIRSSchema.toString());
    }
}
