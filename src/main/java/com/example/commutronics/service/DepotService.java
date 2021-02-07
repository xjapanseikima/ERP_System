package com.example.commutronics.service;

import com.example.commutronics.dao.CompanyRepository;
import com.example.commutronics.dao.DepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepotService {
    @Autowired
    private DepotRepository repo;
    public List getAllDepot() {
        return repo.findAll();
    }
}
