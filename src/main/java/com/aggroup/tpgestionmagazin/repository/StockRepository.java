package com.aggroup.tpgestionmagazin.repository;

import com.aggroup.tpgestionmagazin.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
