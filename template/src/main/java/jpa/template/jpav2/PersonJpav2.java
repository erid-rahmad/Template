package jpa.template.jpav2;

import jpa.template.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpav2 extends JpaRepository<Person,Long> {
}
