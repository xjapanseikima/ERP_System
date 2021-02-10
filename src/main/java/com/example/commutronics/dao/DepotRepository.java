package com.example.commutronics.dao;

import com.example.commutronics.model.Depot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotRepository extends JpaRepository<Depot,Integer> {

}

