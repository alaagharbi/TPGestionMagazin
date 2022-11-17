package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Client;
import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.repository.ClientRepository;
import com.aggroup.tpgestionmagazin.repository.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IFactureServiceIMP implements IFactureService{    FactureRepository factureRepository;
    ClientRepository clientRepository;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c = clientRepository.findById(idClient).orElse(null);
        if(c != null){
            return c.getFactures();
        }
        return null;
    }
    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if(client != null)
            f.setClient(client);
        return null;
    }

}
