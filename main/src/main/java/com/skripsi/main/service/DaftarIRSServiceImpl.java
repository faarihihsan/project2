package com.skripsi.main.service;

import com.skripsi.main.pubsub.RencanaStudiSchema;
import com.skripsi.main.rest.DaftarIRSReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DaftarIRSServiceImpl implements DaftarIRSService{
    @Autowired
    private KafkaTemplate<String, RencanaStudiSchema> kafkaTemplate;

    @Override
    public String SendDaftarIRS(DaftarIRSReq daftarIRSReq) {
        try {
            RencanaStudiSchema rencanaStudiSchema = new RencanaStudiSchema(daftarIRSReq.getNpm(), daftarIRSReq.getIdKelas());
            Message<RencanaStudiSchema> message = MessageBuilder.withPayload(rencanaStudiSchema).setHeader(KafkaHeaders.TOPIC, "IRS_CREATE").build();
            kafkaTemplate.send(message);
            return "berhasil disimpan";
        } catch (Exception e){
            return "gagal : "+e.getMessage();
        }
    }
}
