package com.aggroup.tpgestionmagazin.service;

import com.aggroup.tpgestionmagazin.entity.Client;
import com.aggroup.tpgestionmagazin.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientServiceIMP implements IClientService{
    @Autowired
    ClientRepository clientRepository;


    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }


    @Override
    public Client addClient(Client ce) {
        return clientRepository.save(ce);
    }


    @Override
    public Client updateClient(Client ce) {
        return clientRepository.save(ce);
    }

    @Override
    public Client retrieveClient(long idClient) {
        return null;
    }

    @Override
    public void removeClient(long idClient) {

    }
}
