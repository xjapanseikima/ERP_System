package com.example.commutronics.dao;

import com.example.commutronics.model.Stock;
import com.example.commutronics.model.Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    @Query(value = "INSERT INTO department (deptid, name, loc) VALUES (:deptid,:name,:loc)", nativeQuery = true)
    void newDepartment(@Param("deptid") int deptid, @Param("name") String name, @Param("loc") String loc);
    @Query(value = "INSERT INTO stock (idStock, stockName, quantity) VALUES (:idStock,:stockName,:quantity)", nativeQuery = true)
    void newStock(@Param ("idStock")String idStock, @Param("stockName") String stockName, @Param ("quantity")int quantity);
}

