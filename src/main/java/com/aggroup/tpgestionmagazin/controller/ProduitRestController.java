package com.aggroup.tpgestionmagazin.controller;

import com.aggroup.tpgestionmagazin.entity.Produit;
import com.aggroup.tpgestionmagazin.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitRestController {

    @Autowired
    IProduitService iProduitService;

    @GetMapping()
    public List<Produit> retrieveAllProduits()
    {
        return iProduitService.retrieveAllProduits();
    }

    @PostMapping("/{idRayon}/{idStock}")
    public Produit addProduit(@RequestBody  Produit p, @PathVariable(value = "idRayon") Long idRayon, @PathVariable(value = "idStock") long idStock){
        return iProduitService.addProduit(p,idRayon,idStock);
    }

    @GetMapping("/{idProduit}")
    public Produit retrieveProduit(@PathVariable(value = "idProduit") long idProduit)
    {
        return iProduitService.retrieveProduit(idProduit);
    }

    @PostMapping("/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable(value = "idProduit") long idProduit, @PathVariable(value = "idStock") long idStock)
    {
        iProduitService.assignProduitToStock(idProduit,idStock);
    }

    @PostMapping("/{fournisseurId}/{produitId}")
    public void assignFournisseurToProduit(@PathVariable(value = "fournisseurId") long fournisseurId, @PathVariable(value = "produitId") long produitId)
    {
        iProduitService.assignFournisseurToProduit(fournisseurId, produitId);
    }
}
