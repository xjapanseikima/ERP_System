package com.example.commutronics.controller;

import com.example.commutronics.model.Item_record;
import com.example.commutronics.service.Item_recordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("index")
@CrossOrigin(origins = "http://localhost:4200")
public class Item_recordController {
    @Autowired
    Item_recordService service;
    @GetMapping("/getAllItemRecord")
    public List getAllItemRecord() {
        List itemRecordList = service.getAllItemRecord();
        return itemRecordList;
    }
}
