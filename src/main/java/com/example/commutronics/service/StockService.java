package com.example.commutronics.service;

import com.example.commutronics.dao.StockRepository;
import com.example.commutronics.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StockService {
    @Autowired
    private StockRepository repo;
    public void newStock(Stock stock) {
        repo.newStock(stock.getIdStock(),stock.getStockName(),stock.getQuantity());
    }
}
