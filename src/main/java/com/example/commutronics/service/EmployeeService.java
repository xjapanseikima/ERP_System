package com.example.commutronics.service;

import com.example.commutronics.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;
    public List getAllEmployee() {
        return repo.findAll();
    }
}
