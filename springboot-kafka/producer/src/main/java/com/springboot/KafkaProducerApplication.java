package com.springboot;

import com.springboot.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication {


	@Autowired
	KafkaSender kafkaSender;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);


	}
}
