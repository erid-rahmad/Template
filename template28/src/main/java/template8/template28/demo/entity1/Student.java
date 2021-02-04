package template8.template28.demo.entity1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(fetch=FetchType.LAZY)
    private Passport passport;

    @ManyToMany
    private List<Course> courses = new ArrayList<>();


    public Student(String name) {
        this.name = name;
    }

//        protected Student() {
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Passport getPassport() {
//        return passport;
//    }
//
//    public void setPassport(Passport passport) {
//        this.passport = passport;
//    }
//
//    public Long getId() {
//        return id;
//    }

//    @Override
//    public String toString() {
//        return String.format("Student[%s]", name);
//    }


    @Override
    public String toString() {
        return "{Student" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}