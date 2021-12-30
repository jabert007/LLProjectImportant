package com.jed.lemu.jpa;

import com.jed.lemu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
