package jpa.template.jdbc;

import jpa.template.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Person> findall(){
        return jdbcTemplate.query("SELECT * FROM PERSON" ,new BeanPropertyRowMapper<Person>(Person.class));

    }

    public Person findByid(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM PERSON WHERE ID=?",new Object[] {id} ,new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int DeletByid(int id){
        return jdbcTemplate.update("DELETE FROM PERSON WHERE ID=?",new Object[] {id});
    }

    public int adperson (Person person){
        return jdbcTemplate.update(
                " insert into person (id,name,location,birt_day)"
                +"values (?,?,?,?)",
                new Object[] { person.getId(),person.getName(),person.getLocation(),
                new Timestamp( person.getBirtdate().getTime()) });
    }

    public int update (Person person){
        return jdbcTemplate.update(" update PERSON set name=?,location=?,birt_day=?"
                +"where id =?",new Object[] {person.getName(),person.getLocation(),
                new Timestamp( person.getBirtdate().getTime()),person.getId()});
    }

//    INSERT INTO PERSON (ID,NAME,LOCATION,BIRT_DAY)
//    VALUES (10001,'SERU','DEPOdK',sysdate());


}
