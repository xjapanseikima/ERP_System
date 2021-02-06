package com.example.commutronics.service;

import com.example.commutronics.dao.CompanyRepository;
import com.example.commutronics.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CompanyService {
    @Autowired
    private CompanyRepository repo;
    public List getAllCompany() {
        return repo.findAll();
    }
}
