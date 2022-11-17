package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock ce);

    Stock updateStock(Stock ce);

    Stock retrieveStock(long idStock);

    void removeStock(long idStock);
}
