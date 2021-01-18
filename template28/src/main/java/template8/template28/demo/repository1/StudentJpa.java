package template8.template28.demo.repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import template8.template28.demo.entity1.Student;

public interface StudentJpa extends JpaRepository<Student,Long> {

}
