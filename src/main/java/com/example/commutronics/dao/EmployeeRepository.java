package com.example.commutronics.dao;

import com.example.commutronics.model.Employee;
import com.example.commutronics.model.Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

