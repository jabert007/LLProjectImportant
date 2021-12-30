package com.jed.lemu.rest;


import com.jed.lemu.entity.Product;
import com.jed.lemu.jpa.Repository;
import com.jed.lemu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/rest/")
public class ProductController {

    @Autowired
    ProductService service;


    @PostMapping("/addproduct")
    String addProduct(@RequestBody Product newproduct){

        System.out.println(newproduct.toString());
        service.save(newproduct);
        return "added" ;
       // return "added";
    }

    @GetMapping("/getproducts")
    List<Product> getProducts(){
        return service.listAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id){
        try {
            Product product = service.getProductByid(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);

        }
        catch (NoSuchElementException no){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updtproduct/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Product updateproduct,@PathVariable String id){
        try {
            Product existproduct = service.getProductByid(id);
            System.out.println(" checking product "+existproduct.toString());
            if(existproduct.getId() != null) {
                service.save(updateproduct);
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException no){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
