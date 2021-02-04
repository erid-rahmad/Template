package com.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReciever {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReciever.class);

	@KafkaListener(topics = "${kafka.topic.name}", group = "${kafka.consumer.group.id}")
	public void recieveData(String student) {
		LOGGER.info("Data - " + student.toString() + " recieved");

	}
}
