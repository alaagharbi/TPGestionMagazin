package com.aggroup.tpgestionmagazin.controller;

import com.aggroup.tpgestionmagazin.entity.Stock;
import com.aggroup.tpgestionmagazin.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StockRestController {

    @Autowired
    IStockService iStockService;


    @GetMapping("RetieveAllClient")
    public List<Stock> retrieveAllStocks(){
        return iStockService.retrieveAllStocks();
    }



    @PostMapping("/AddStock")
    public  Stock addStock(@RequestBody Stock ce){
        return  iStockService.addStock(ce);
    }


    @PutMapping("/updateStock")
    public  Stock updateClient(@RequestBody Stock ce){return  iStockService.updateStock(ce);}


    @GetMapping("/retrieveStock/{id}")
    public Stock retrieveStock(@PathVariable(value="id") long id) {
        return iStockService.retrieveStock(id);

    }

}
