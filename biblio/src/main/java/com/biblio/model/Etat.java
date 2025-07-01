package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Etat")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etat")
    private Integer idEtat;

    public Integer getIdEtat() {
        return idEtat;
    }

    public void setIdEtat(Integer idEtat) {
        this.idEtat = idEtat;
    }

    @Column(name = "nom")
    private String nom;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Etat() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public java.time.LocalDateTime getDatedelete() {
        return datedelete;
    }

    public void setDatedelete(java.time.LocalDateTime datedelete) {
        this.datedelete = datedelete;
    }
}
