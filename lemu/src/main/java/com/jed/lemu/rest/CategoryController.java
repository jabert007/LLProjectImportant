package com.jed.lemu.rest;

import com.jed.lemu.entity.Category;
import com.jed.lemu.jpa.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    Repository repository;

    @GetMapping("/category")
    List<Category> getAllCategory(){
       return repository.findAll();
    }

    @PostMapping("/addcategory")
    Category addCategory(String category){
        return repository.insert(new Category(category));
    }
}
