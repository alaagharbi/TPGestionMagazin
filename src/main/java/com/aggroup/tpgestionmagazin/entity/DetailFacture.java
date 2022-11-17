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
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture ;
    private int qte;
    private float prixTotal;
    private int pourcentageRemise;
    private int montantRemise;

    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Facture facture;
}
