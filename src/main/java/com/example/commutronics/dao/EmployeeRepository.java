package com.example.commutronics.dao;

import com.example.commutronics.model.Employee;
import com.example.commutronics.model.Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO employee (employee_id, employee_name) VALUES (:employee_id,:employee_name)", nativeQuery = true)
    void newEmployee(int employee_id, String employee_name);
}

