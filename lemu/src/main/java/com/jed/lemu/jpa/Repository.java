package com.jed.lemu.jpa;


import com.jed.lemu.entity.Category;
import com.jed.lemu.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.swing.plaf.IconUIResource;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

//Repository
//Transaction  Management
@org.springframework.stereotype.Repository
@Transactional
public class Repository {

    //Connect to JDBC - earlier we used Jdbc template now its JPA
    //Persitance context
    //All operations will go through entity manager which is the interface to Persistance context
    @PersistenceContext
    EntityManager entityManager;


    public Product findByname(String name){
        return entityManager.find(Product.class,name);
    }

    public Product save(Product product){

        if(product.getName() == null){
            entityManager.persist(product);
        }
        else {
            entityManager.merge(product);
        }
        return product;
    }

    public Product insrt(Product product){
        entityManager.persist(product);
        return product;
    }

    public Product updte(Product product){
        entityManager.merge(product);
        return product;
    }



    /*public Product deleteByname(String name){

    }*/



}
