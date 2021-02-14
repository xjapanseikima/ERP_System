package com.example.commutronics.controller;


import com.example.commutronics.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
@CrossOrigin(origins = "http://localhost:4200")
public class SetController {
    @Autowired
    private SetService service;

    @GetMapping("/getAllSet")
    public List getAllSets(){
        List setList = service.getAllSets();
        return setList;
    }
}
