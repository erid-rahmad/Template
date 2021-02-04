package template8.template28.demo.repository1;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import template8.template28.demo.entity1.Course;
import template8.template28.demo.entity1.Passport;
import template8.template28.demo.entity1.Review;
import template8.template28.demo.entity1.Student;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository

@Slf4j
public class StudentRepository {


	@Autowired
	EntityManager em;

	@Autowired
	StudentJpa studentJpa;

	@Transactional
	public Student findById(Long id) {
		return em.find(Student.class, id);
	}


	public Passport findByIdP(Long id) {
		return em.find(Passport.class, id);
	}
	public void graball(){

	}

	public void  findall(){
		log.info("this find all {}",studentJpa.findAll());

	}

	public Student save(Student student) {

		if (student.getId() == null) {
			em.persist(student);
		} else {
			em.merge(student);
		}
		return student;
	}

	public void deleteById(Long id) {
		Student student = findById(id);
		em.remove(student);
	}


	@Transactional
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z123456");
		log.info("clear1");
		em.persist(passport);

		log.info("clear2");

		Student student = new Student("Mike");
		log.info("clear3");
		student.setPassport(passport);
		log.info("clear4");
		em.persist(student);
	}

	public Course findByIdaa(Long id) {
		return em.find(Course.class, id);
	}



	public void onemany() {
		Course course = em.find(Course.class, 10001l);
		Course course1= new  Course("tono");
		log.info("this course {}",course);
		log.info("this course 1 {}",course.getReviews());
		Review review = new Review ("12","asdasd");
		course.addReview(review);
		review.setCourse(course);
		em.persist(review);
		em.merge(course1);
	}

	public void findbyname(){
	}
}
