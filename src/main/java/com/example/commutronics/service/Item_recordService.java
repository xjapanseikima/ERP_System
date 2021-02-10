package com.example.commutronics.service;

import com.example.commutronics.dao.Item_recordRepository;
import com.example.commutronics.model.Item_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Item_recordService {
    @Autowired
    private Item_recordRepository repo;
    public List<Item_record> getAllItemRecord() {
        return repo.findAll();
    }
}
