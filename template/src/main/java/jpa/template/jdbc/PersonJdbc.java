package jpa.template.jdbc;

import jpa.template.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbc {

    class Personrowmaper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
           Person person = new Person();
           person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirtdate(rs.getDate("birtdate"));
           return person;
        }
    }

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Person> findall(){
//        return jdbcTemplate.query("SELECT * FROM PERSON" ,new BeanPropertyRowMapper<Person>(Person.class));
        return jdbcTemplate.query("SELECT * FROM PERSON" ,new Personrowmaper());

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
}
