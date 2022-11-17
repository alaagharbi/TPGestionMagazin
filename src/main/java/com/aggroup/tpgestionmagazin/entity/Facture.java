package com.aggroup.tpgestionmagazin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture ;
    private float montantRemise ;
    private float montantFacture;
    private Date dateFacture;
    private boolean active;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;
    @ManyToOne
    private Client client;
}
