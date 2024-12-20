package com.misael.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.misael.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L,"Memoria RAM", 320L),
            new Product(2L, "CPU Intel core i7 13th", 1240L),
            new Product(3L, "Mouse Gaming Logi", 260L),
            new Product(4L, "MotherBoard", 300L));
    }

    public List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
