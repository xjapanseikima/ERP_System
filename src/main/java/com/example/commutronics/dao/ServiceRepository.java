package com.example.commutronics.dao;

import com.example.commutronics.model.Import;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Import,Integer> {
}
