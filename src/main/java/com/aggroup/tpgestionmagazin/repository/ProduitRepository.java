package com.aggroup.tpgestionmagazin.repository;

import com.aggroup.tpgestionmagazin.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
