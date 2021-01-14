package jpa.template;


import jpa.template.jdbc.PersonJdbc;
import jpa.template.jpa.PersonJpa;
import jpa.template.jpa.CourseRepository;
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

	@Autowired
	PersonJpa personJpa;

	@Autowired
	CourseRepository courseRepository;



	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			/*
//			log.info("This by id {}",String.valueOf(personJdbc.findByid(10001)));
//			log.info("This by id {}",String.valueOf(personJdbc.DeletByid(10001)));
//			log.info("This find all {}",String.valueOf(personJdbc.findall()));


			log.info("This insert {}",String.valueOf(personJpa.insert(new Person(0,"tarii","berlas", new Date()))));
			log.info("This update  {}",String.valueOf(personJpa.update(new Person(10002,"tarii","berlasaxax", new Date()))));
			log.info("This find by id {}",String.valueOf(personJpa.findbyid(10002)));
			personJpa.delet(10002);

			log.info("all jpa {}",String.valueOf(personJpa.listall()));
//			log.info("all jpa {}",String.valueOf(personJpa.asd()));
			*/
			personJpa.playwithentity();
			log.info("all jpa {}",String.valueOf(personJpa.listall()));
			courseRepository.playWithEntityManager();
			personJpa.findalll();



		}catch (Exception e){
			log.info(String.valueOf(e));
		}
	}
}
