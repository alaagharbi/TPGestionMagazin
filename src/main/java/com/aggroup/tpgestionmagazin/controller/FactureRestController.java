package com.aggroup.tpgestionmagazin.controller;

import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("facture")
public class FactureRestController {
    @Autowired
    IFactureService iFactureService;

    @GetMapping()
    public List<Facture> retrieveAllFactures()
    {
        return iFactureService.retrieveAllFactures();
    }

    @DeleteMapping("/{idFacture}")
    public void cancelFacture(@PathVariable(value = "idFacture") long idFacture)
    {
        iFactureService.cancelFacture(idFacture);
    }

    @GetMapping("/{idFacture}")
    public Facture retrieveFacture(@PathVariable(value = "idFacture") long idFacture)
    {
        return iFactureService.retrieveFacture(idFacture);
    }

    @GetMapping("/{idClient}")
    public List<Facture> getFacturesByClient(@PathVariable(value = "idClient") long idClient)
    {
        return iFactureService.getFacturesByClient(idClient);
    }

    @PostMapping("/{idClient}")
    public Facture addFacture(@RequestBody Facture f, @PathVariable(value = "idClient") Long idClient)
    {
        return iFactureService.addFacture(f,idClient);
    }



}
