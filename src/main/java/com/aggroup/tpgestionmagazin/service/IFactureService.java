package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.entity.Stock;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByClient(Long idClient);
    Facture addFacture(Facture f, Long idClient);


}
