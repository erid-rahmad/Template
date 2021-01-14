package JPA.template_v2.jpa;

import JPA.template_v2.entity.Person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@Slf4j
public class PersonJpa {

    @PersistenceContext
    EntityManager entityManager;

    public Person findbyid(int id){
        return entityManager.find(Person.class,id);
    }

    public List<Person> asd(){
        log.info("this ");
        TypedQuery<Person> namedquery = entityManager.createQuery("Person.findall",Person.class);
        log.info(String.valueOf(namedquery));
        return namedquery.getResultList();
    }

    public Person insert(Person person){
        log.info("this person insert {}",person);
        return entityManager.merge(person);
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
}
