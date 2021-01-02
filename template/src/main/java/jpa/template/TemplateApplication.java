package jpa.template;

import jpa.template.jdbc.PersonJdbc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class TemplateApplication implements CommandLineRunner {

	@Autowired
	PersonJdbc personJdbc;

	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("This by id {}",String.valueOf(personJdbc.findByid(10001)));
		log.info("This by id {}",String.valueOf(personJdbc.DeletByid(10001)));
		log.info("This find all {}",String.valueOf(personJdbc.findall()));



	}
}
