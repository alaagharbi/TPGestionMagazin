package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Client;

import java.util.List;

public interface IClientService {

    public List<Client> retrieveAllClients();
    public Client addClient(Client ce);
    public Client updateClient(Client ce);
    public Client retrieveClient(long idClient);
    public void removeClient(long idClient);
}
