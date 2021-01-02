package jpa.template.entity;

import lombok.Data;

import java.util.Date;

@Data

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birtdate;

    public Person(int id, String name, String location, Date birtdate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birtdate = birtdate;
    }

    public Person() {
    }
}
