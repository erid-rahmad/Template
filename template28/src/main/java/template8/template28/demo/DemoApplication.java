package template8.template28.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.transaction.annotation.Transactional;
import template8.template28.demo.entity1.Course;
import template8.template28.demo.entity1.Passport;
import template8.template28.demo.entity1.Student;
import template8.template28.demo.repository1.CourseRepository;
import template8.template28.demo.repository1.StudentJpa;
import template8.template28.demo.repository1.StudentRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentJpa studentJpa;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {
//		repository.playWithEntityManager();
//		repository.findbyname();\

		studentRepository.saveStudentWithPassport();

//		log.info("this find by id {}",studentRepository.findById(20001l));

		log.info("this stud {}",studentRepository.findById(20001l));

		Student student=studentRepository.findById(20001l);
		log.info("this studasaa {}",student.getPassport());

		Passport passport=studentRepository.findByIdP(40001l);
		log.info("passport {}",passport);
		log.info("passport2 {}",passport.getStudent());
		studentRepository.onemany();
		Course course =studentRepository.findByIdaa(10001l);
		log.info("courseeee {}",course.getReviews());
		log.info("this pass {}",studentRepository.findByIdP(40001l));
		Student student1 = studentRepository.findById(20001l);
		log.info("this find by id {}",student1.getCourses());






	}	
}
