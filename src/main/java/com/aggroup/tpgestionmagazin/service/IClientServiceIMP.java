package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.CategorieClient;
import com.aggroup.tpgestionmagazin.entity.Client;
import com.aggroup.tpgestionmagazin.entity.Facture;
import com.aggroup.tpgestionmagazin.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IClientServiceIMP implements IClientService{    @Autowired
ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
        List<Client> list = clientRepository.getClientsByCategorieClient(categorieClient);
        float s = 0;
        for(Client c : list)
            s += sommeFactures(c,startDate, endDate);
        return s;
    }

    private float sommeFactures(Client client, Date startDate, Date endDate)
    {
        return (float) client.getFactures()
                .stream()
                .filter(facture -> !facture.getActive() && facture.getDateFacture().after(startDate)  && facture.getDateFacture().before(endDate))
                .collect(Collectors.summarizingDouble(Facture::getMontantFacture))
                .getSum();
    }
}
