package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.repository.FactureRepository;

import java.util.List;

public class IFactureServiceIMP implements IFactureService{
    FactureRepository factureRepository;
    @Override
    public List<Facture> retrieveAllFacture() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(long id) {
        return null;
    }
}
