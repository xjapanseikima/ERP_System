package com.example.commutronics.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.commutronics.model.Item_record;

@Repository
public interface Item_recordRepository extends JpaRepository<Item_record,Integer> {
}