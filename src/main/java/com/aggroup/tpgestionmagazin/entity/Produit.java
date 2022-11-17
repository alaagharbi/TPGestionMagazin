package com.aggroup.tpgestionmagazin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;


    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;
@OneToOne(mappedBy = "produit")
private DetailProduit detailProduit;

    @ManyToMany
    private List<Fournisseur> fournisseurs;
    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
}
