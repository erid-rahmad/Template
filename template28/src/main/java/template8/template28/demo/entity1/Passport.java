package template8.template28.demo.entity1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Transactional
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Passport {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String code;

    @OneToOne(fetch=FetchType.LAZY, mappedBy="passport")
    private Student student;

//    protected Passport() {
//    }
//
    public Passport(String number) {
        this.code = number;
    }



//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
//
//    public Long getId() {
//        return id;
//    }

//    @Override
//    public String toString() {
//        return String.format("Passport[%s]", code);
//    }
}