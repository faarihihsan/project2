package com.skripsi.dataAccess.pubsub;

import com.skripsi.dataAccess.pubsub.schema.RencanaStudiSchema;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
    @Bean
    public ConsumerFactory<String, RencanaStudiSchema> IRSCreateConsumerFactory() {
        JsonDeserializer<RencanaStudiSchema> deserializer = new JsonDeserializer<>(RencanaStudiSchema.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");
        deserializer.setUseTypeMapperForKey(true);

        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG,"data-accessor-consumer-1");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,deserializer);
        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                deserializer
        );
    }

    @Bean(name = "kafkaListenerContainerFactory")
    public ConcurrentKafkaListenerContainerFactory<String, RencanaStudiSchema>
    kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, RencanaStudiSchema> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(IRSCreateConsumerFactory());
        return factory;
    }


    @Bean
    public ConsumerFactory<String, RencanaStudiSchema> IRSUpdateConsumerFactory() {
        JsonDeserializer<RencanaStudiSchema> deserializer = new JsonDeserializer<>(RencanaStudiSchema.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");
        deserializer.setUseTypeMapperForKey(true);

        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG,"data-accessor-update-consumer-1");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,deserializer);
        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                deserializer
        );
    }

    @Bean(name = "rencanaStudiSchemaConcurrentKafkaListenerContainerFactory")
    public ConcurrentKafkaListenerContainerFactory<String, RencanaStudiSchema>
    rencanaStudiSchemaConcurrentKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, RencanaStudiSchema> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(IRSUpdateConsumerFactory());
        return factory;
    }
}
