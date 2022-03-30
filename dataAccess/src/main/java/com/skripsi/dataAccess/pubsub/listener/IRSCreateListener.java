package com.skripsi.dataAccess.pubsub.listener;

import com.skripsi.dataAccess.pubsub.schema.RencanaStudiSchema;
import com.skripsi.dataAccess.service.IRSDataInjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IRSCreateListener {
    @Autowired
    private IRSDataInjectionService irsDataInjectionService;

    @Qualifier("kafkaListenerContainerFactory")
    @KafkaListener(topics = "IRS_CREATE", groupId = "data-accessor-consumer-1", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(@Payload RencanaStudiSchema rencanaStudiSchema, @Headers MessageHeaders headers) throws IOException {
        System.out.println("Received Message : " + rencanaStudiSchema.toString());
        irsDataInjectionService.injectDataIRS(rencanaStudiSchema);
    }
}
