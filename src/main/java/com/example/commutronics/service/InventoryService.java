package com.example.commutronics.service;

import com.example.commutronics.dao.InventoryRepository;
import com.example.commutronics.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository repo;
    public List getAllInventory() {
        return repo.findAll();
    }

}
