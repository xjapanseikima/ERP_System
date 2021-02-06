package com.example.commutronics.controller;

import com.example.commutronics.model.Employee;
import com.example.commutronics.model.Stock;
import com.example.commutronics.service.EmployeeService;
import com.example.commutronics.service.StockService;
import com.example.commutronics.service.Transcationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("index")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @GetMapping("/getEmployee")
    public List getAllEmployee() {
        List Employee = service.getAllEmployee();
        return Employee;
    }
    /*
    * This is for Post testing
    * */
    @PostMapping("/createEmployee")
    public void newEmployee(Employee employee){
        employee.setEmployee_name("test employee 再試一次");
        employee.setEmployee_id(9);
        service.newEmployee(employee);
    }
    /*
     * This is for Post testing
     * */
    @DeleteMapping("/deleteEmployee")
    public void deleteEmployeeById(Employee employee){
        employee.setEmployee_id(9);
        service.deleteEmployeeById(employee);
    }
}
