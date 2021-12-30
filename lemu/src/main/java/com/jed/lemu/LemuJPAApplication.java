package com.jed.lemu;

import com.jed.lemu.entity.Category;
import com.jed.lemu.jdbc.PersonDAO;
import com.jed.lemu.jpa.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LemuJPAApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Repository repository;

    public static void main(String[] args) {
        SpringApplication.run(LemuJPAApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

          //repository.findByname("cocunut");

    }

}
