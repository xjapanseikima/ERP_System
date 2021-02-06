package com.example.commutronics.service;


import com.example.commutronics.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List getAllProducts(){
        return repo.findAll();
    }
}


