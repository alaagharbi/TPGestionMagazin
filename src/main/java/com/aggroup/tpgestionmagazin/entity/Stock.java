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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock;
    private int qteStock;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    private List<Produit> produits;
}
