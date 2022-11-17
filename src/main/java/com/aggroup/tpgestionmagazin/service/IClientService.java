package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.CategorieClient;
import com.aggroup.tpgestionmagazin.entity.Client;

import java.util.Date;
import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
    float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);

}
