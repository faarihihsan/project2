package com.skripsi.dataAccess.pubsub.listener;

import com.skripsi.dataAccess.pubsub.schema.RencanaStudiSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IRSUpdateListener {
    @Qualifier("rencanaStudiSchemaConcurrentKafkaListenerContainerFactory")
    @KafkaListener(topics = "IRS_UPDATE", groupId = "data-accessor-update-consumer-1", containerFactory = "rencanaStudiSchemaConcurrentKafkaListenerContainerFactory")
    public void listenUpdateIRSMessage(@Payload RencanaStudiSchema rencanaStudiSchema, @Headers MessageHeaders headers) throws IOException {
        System.out.println("Received Message : " + rencanaStudiSchema.toString());
//        irsDataInjectionService.injectDataIRS(rencanaStudiSchema);
    }
}
