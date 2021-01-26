package com.example.commutronics.service;

import com.example.commutronics.dao.TranscationRepository;
import com.example.commutronics.model.Transcation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Transcationservice {
    @Autowired
    private TranscationRepository repo;
    public List getTranscation() {
       return repo.findAll();
    }
}
