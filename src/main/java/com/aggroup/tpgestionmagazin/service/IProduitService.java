package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
    void assignFournisseurToProduit(Long fournisseurId, Long produitId);
}