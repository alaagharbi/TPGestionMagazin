package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
