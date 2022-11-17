package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.entity.Stock;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveAllFacture();
    void cancelFacture(Long id);
    Facture retrieveFacture(long id);

}
