package jpa.template;

import jpa.template.entity.Person;
import jpa.template.jdbc.PersonJdbc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

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
		log.info("This find all {}",String.valueOf(personJdbc.adperson(new Person(10005,"tarii","berlas", new Date()))));
		log.info("This find all {}",String.valueOf(personJdbc.update(new Person(10002,"tarii","berlasaxax", new Date()))));
		log.info("This find all {}",String.valueOf(personJdbc.findall()));





	}
}
