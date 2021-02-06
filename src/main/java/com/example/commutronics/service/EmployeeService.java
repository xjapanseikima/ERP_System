package com.example.commutronics.service;

import com.example.commutronics.dao.EmployeeRepository;
import com.example.commutronics.model.Employee;
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
    public void newEmployee(Employee employee) {
        repo.newEmployee(employee.getEmployee_id(),employee.getEmployee_name());
    }
    public void deleteEmployeeById(Employee employee) {
        repo.deleteById(employee.getEmployee_id());
    }
}
