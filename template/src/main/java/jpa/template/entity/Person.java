package jpa.template.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private int id;
    private String name;
    private String location;
    private Date birtdate;

}
