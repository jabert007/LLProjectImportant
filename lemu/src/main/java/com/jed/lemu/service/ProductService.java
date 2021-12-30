package com.jed.lemu.service;

import com.jed.lemu.entity.Product;
import com.jed.lemu.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product>  listAll(){
        return repo.findAll();
    }
    public void save(Product product){
        repo.save(product);
    }

    public Product getProductByid(String id){
        return repo.findById(id).get();
    }

    public void deleteById(String id){
        repo.deleteById(id);
    }
}
