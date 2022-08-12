package com.erygindmitry.springmag.spring_boot_springmag.repositories;

import com.erygindmitry.springmag.spring_boot_springmag.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository  extends JpaRepository <Product, Long> {
    List<Product> findByTitle(String title);
}
