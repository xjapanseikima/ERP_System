package com.example.commutronics.service;

import com.example.commutronics.dao.ExportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportService {
    @Autowired
    private ExportRepository repo;

    public List getAllExport(){
        return repo.findAll();
    }
}
