package com.example.commutronics.dao;


import com.example.commutronics.model.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface SetRepository extends JpaRepository<Set, Integer> {
}
