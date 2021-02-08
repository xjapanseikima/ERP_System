package com.example.commutronics.service;

import com.example.commutronics.dao.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetService {
    @Autowired
    private SetRepository repo;

    public List getAllSets(){
        return repo.findAll();
    }
}
