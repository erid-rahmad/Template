package template8.template28.demo.repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import template8.template28.demo.entity1.Course;

public interface CourseJpa extends JpaRepository<Course,Long> {
}
