package com.example.commutronics.controller;
import com.example.commutronics.model.Stock;
import com.example.commutronics.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("index")
@CrossOrigin(origins = "http://localhost:4200")
public class StockController {
    @Autowired
    StockService service;
    @PostMapping("/create")
    public void newStock(Stock stock){
        Stock stock_test = null;
        stock_test.setIdStock("123");
        stock_test.setQuantity(3);
        stock_test.setStockName("P8268");
        service.newStock(stock_test);
    }
}