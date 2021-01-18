package template8.template28.demo.repository1;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import template8.template28.demo.entity1.Course;

import java.util.List;
import java.util.Optional;


@Repository
@Transactional
@Slf4j
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;

	@Autowired
	CourseJpa courseJpa;

	public Course findById(Long id) {

		return em.find(Course.class, id);
	}

	public Course save(Course course) {

		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}

		return course;
	}

	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}

	public void playWithEntityManager() {
		
		Course course1 = new Course("Web Services in 100 Steps");
		em.persist(course1);
		
		Course course2 = new Course("Angular Js in 100 Steps");
		em.persist(course2);

		em.flush();

		log.info("this before update {}",courseJpa.findAll());

		course1.setName("Web Services in 100 Steps - Updated");
		course2.setName("Angular Js in 100 Steps - Updated");

		em.refresh(course1);

		em.flush();

	}

	public void findbyname(){

		List<Course> tes = em.createQuery("Select c From Course c").getResultList();

		List<Course> tes2 = em.createNamedQuery("selectall").getResultList();

		log.info("this tes {}",tes);
		log.info("this tes2 {}",tes2);

		Object asek = em.createQuery("Select c From Course c where id=2").getSingleResult();

		Course coba = courseJpa.getOne(2l);

		String x =coba.getName();

		log.info("this x {}",x);

		log.info("this asek {}",asek);

		Query query = em.createNativeQuery("SELECT * FROM COURSE",Course.class);
		List ress =query.getResultList();
		log.info("this native {}",ress);

		Query query1 = em.createNativeQuery("SELECT * FROM COURSE where id=?",Course.class);
		query1.setParameter(1,2l);
		List ress1 =query1.getResultList();
		log.info("this native1 {}",ress1);


	}
}
