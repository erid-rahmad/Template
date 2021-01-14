package jpa.template.jpa;

import jpa.template.entity.Person;
import jpa.template.jpav2.PersonJpav2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
@Slf4j
public class PersonJpa {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PersonJpav2 personJpav2;



    public Person findbyid(long id){
        return entityManager.find(Person.class,id);
    }

    public List<Person> asd(){
        log.info("this ");
        TypedQuery<Person> namedquery = entityManager.createQuery("Person.findall",Person.class);
        log.info(String.valueOf(namedquery));
        return namedquery.getResultList();
    }

    public List<Person> listall(){
        log.info("this ");
        return personJpav2.findAll();
    }

    public Person insert(Person person){
        log.info("this person insert {}",person);

        if (person.getId() == 0){
            entityManager.persist(person);
            log.info("using persistance");
        }
        else {
             entityManager.merge(person);
        }
        return person;
    }

    public Person update(Person person){
        log.info("this person update {}",person);
        return entityManager.merge(person);
    }

    public void delet(int id){
        log.info("this person delet {}",id);
        Person person = findbyid(id);
        entityManager.remove(person);
    }

    public void findalll(){
        TypedQuery<Person> query = entityManager.createQuery("Select c From Person c where id=1",Person.class);
        List<Person> result = query.getResultList();

        log.info("this log",result);
    }

    public void playwithentity(){
        Date date =new Date();
//        Person person =new Person(5,"tetes","tesss",date);
//        entityManager.persist(person);
//
//        Person person1 =new Person(3,"asdasd","aaaaa",date);
//        entityManager.persist(person1);
//
//        entityManager.flush();
//
//        person.setLocation("location ser");
//        person1.setLocation("asdasd");
//
//        entityManager.refresh(person);
//
//        entityManager.flush();

    }
}
