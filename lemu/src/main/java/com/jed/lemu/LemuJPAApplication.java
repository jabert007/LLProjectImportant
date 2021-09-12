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
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
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


        logger.info("Insert ", repository.insert(new Category("Agriculture")));
        logger.info("Insert ", repository.insert(new Category("Fertilizer")));
        logger.info("Insert ", repository.insert(new Category("Horiculture")));
        logger.info("Insert ", repository.insert(new Category("Properties")));

        logger.info("find all category -> {} ", repository.findAll());

    }

}
