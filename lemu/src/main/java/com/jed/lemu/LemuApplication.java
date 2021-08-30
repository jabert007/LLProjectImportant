package com.jed.lemu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jed.lemu.jdbc.PersonDAO;

//@SpringBootApplication
public class LemuApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//@Autowired
	PersonDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(LemuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	logger.info("All users -> {} ", dao.findAll());
	//	logger.info("Person for id -> {} ", dao.findById(1002).toString());
	}

}
