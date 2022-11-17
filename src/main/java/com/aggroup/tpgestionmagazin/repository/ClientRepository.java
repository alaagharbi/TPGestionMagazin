package com.aggroup.tpgestionmagazin.repository;

import com.aggroup.tpgestionmagazin.entity.CategorieClient;
import com.aggroup.tpgestionmagazin.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> getClientsByCategorieClient(CategorieClient categorieClient);

}
