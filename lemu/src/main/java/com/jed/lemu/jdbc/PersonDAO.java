package com.jed.lemu.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jed.lemu.entity.Person;

@Repository
public class PersonDAO {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	/*public List<Person> findAll(){
		
		return jdbctemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
		
	}*/
	
	/*public Object findById(int id) {
		
		 //return jdbctemplate.queryForObject(null, null, null);
		return jdbctemplate.queryForObject("select * from person where id = ?", new BeanPropertyRowMapper(Person.class), new Object[] {id});
	}*/

}
