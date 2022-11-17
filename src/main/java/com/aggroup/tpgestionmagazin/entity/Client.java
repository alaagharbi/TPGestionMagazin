package com.aggroup.tpgestionmagazin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String nom;
    private String prenom;
    private Date dateNaissaance;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;
    private Profession profession;
    @OneToMany(mappedBy = "client")
    private List<Facture> factures;
}
