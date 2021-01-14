package JPA.template_v2;

import JPA.template_v2.entity.Person;
import JPA.template_v2.jpa.PersonJpa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class TemplateV2Application implements CommandLineRunner {


	

	@Autowired
	PersonJpa personJpa;

	public static void main(String[] args) {
		SpringApplication.run(TemplateV2Application.class, args);
	}

	@Override	public void run(String... args) throws Exception {

		try {
//			log.info("This by id {}",String.valueOf(personJdbc.findByid(10001)));
//			log.info("This by id {}",String.valueOf(personJdbc.DeletByid(10001)));
//
//			log.info("This insert {}",String.valueOf(personJpa.insert(new Person(10005,"tarii"))));
//			log.info("This insert {}",String.valueOf(personJpa.insert(new Person(10003,"tarii"))));
//			log.info("This insert {}",String.valueOf(personJpa.insert(new Person(10002,"tarii"))));
//			log.info("This insert {}",String.valueOf(personJpa.insert(new Person(10001,"tarii"))));
//			log.info("This update all {}",String.valueOf(personJpa.update(new Person(10002,"tasdasdadarii"))));
//			log.info("person jpa {}",String.valueOf(personJpa.findbyid(10002)));
//			personJpa.delet(10002);
//
//			log.info(String.valueOf(personJpa.asd()));

		}catch (Exception e){
			log.info(String.valueOf(e));
		}
	}

}
