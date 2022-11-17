package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Stock;
import com.aggroup.tpgestionmagazin.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IStockServiceIMP implements IStockService{

    @Autowired
    StockRepository stockRepository;


    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }


    @Override
    public Stock addStock(Stock ce) {
        return stockRepository.save(ce);
    }


    @Override
    public Stock updateStock(Stock ce) {
        return stockRepository.save(ce);
    }

    @Override
    public Stock retrieveStock(long idStock) {
        return null;
    }

    @Override
    public void removeStock(long idStock) {

    }
}
