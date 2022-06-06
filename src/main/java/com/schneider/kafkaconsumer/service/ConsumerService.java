package com.schneider.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics="schneider-test", groupId="test-consumer-group")
	public void consumerFromTopic(String message) {
		System.out.println("Consumed message: " + message);
	}
}
