package com.miguel.kafka_producer.resources;

import com.miguel.kafka_producer.services.StringProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class StringProducerResource {

    private final StringProducerService stringProducerService;

    public StringProducerResource(StringProducerService stringProducerService) {
        this.stringProducerService = stringProducerService;
    }

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message){
        stringProducerService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}