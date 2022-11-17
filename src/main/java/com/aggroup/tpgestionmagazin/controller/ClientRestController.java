package com.aggroup.tpgestionmagazin.controller;

import com.aggroup.tpgestionmagazin.entity.Client;
import com.aggroup.tpgestionmagazin.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientRestController {
    @Autowired
    IClientService iClientService;


    @GetMapping("RetieveAllClient")
    public List<Client> retrieveAllContrats(){
        return iClientService.retrieveAllClients();
    }



    @PostMapping("/AddClient")
    public  Client addClient(@RequestBody Client ce){
        return  iClientService.addClient(ce);
    }


    @PutMapping("/updateClient")
    public  Client updateClient(@RequestBody Client ce){return  iClientService.updateClient(ce);}


    @GetMapping("/retrieveClient/{id}")
    public Client retrieveClient(@PathVariable(value="id") long id) {
        return iClientService.retrieveClient(id);

    }

    @DeleteMapping("/removeClient/{id}")
    public void removeClient(@PathVariable(value ="id") long id) {
        iClientService.deleteClient(id);
    }

}
