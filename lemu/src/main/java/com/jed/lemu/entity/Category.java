package com.jed.lemu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_category", query = "select p from Category p")
public class Category {

    @Id
    private String categoryname;

    public Category(){

    }
    public Category(String categoryname){
        super();
        this.categoryname = categoryname;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryname='" + categoryname + '\'' +
                '}';
    }
}
