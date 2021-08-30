package com.jed.lemu.jpa;


import com.jed.lemu.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

    /*public Category findById(int id){
         return entityManager.find(Category.class,id);
    }*/

    public Category insert(Category category){
        return entityManager.merge(category);
    }

    //Using JPQL
    public List<Category> findAll(){
        TypedQuery namedquery = entityManager.createNamedQuery("find_all_category",Category.class);
        return namedquery.getResultList();
    }
}
