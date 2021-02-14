package com.example.commutronics.controller;

import com.example.commutronics.model.Inventory;
import com.example.commutronics.service.InventoryService;
import com.example.commutronics.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
@CrossOrigin(origins = "http://localhost:4200")
public class InventoryController {
    @Autowired
    private InventoryService service;
    @GetMapping("/getAllInventory")
    public List getAllInventory(){
        List Product = service.getAllInventory();
        return Product;
    }
}
