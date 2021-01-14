package jpa.template;

import jpa.template.entity.Person;
import jpa.template.jpa.PersonJpa;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
class TemplateApplicationTests {

	@Autowired
	PersonJpa personJpa;

	@Test

	void contextLoads() {
		Person personnjpa= personJpa.findbyid(10001);
		log.info(String.valueOf(personnjpa));

	}

}
