package jpa.template.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
//@NamedQuery(name="findall",query="select p from Person p")
@NamedQuery(name = "Person.findall",query = "select p from Person p")
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String location;
    private Date birtdate;

}
