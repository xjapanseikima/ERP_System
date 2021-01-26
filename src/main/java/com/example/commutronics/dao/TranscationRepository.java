package com.example.commutronics.dao;

import com.example.commutronics.model.Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TranscationRepository extends JpaRepository<Transcation, Integer> {
    Transcation findByInvoiceid(String id);
}
