package JPA.template_v2.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;


}
