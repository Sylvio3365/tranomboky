package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_abonnement")
    private Integer idAbonnement;

    public Integer getIdAbonnement() {
        return idAbonnement;
    }

    public void setIdAbonnement(Integer idAbonnement) {
        this.idAbonnement = idAbonnement;
    }

    @Column(name = "mois")
    private Integer mois;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "tarif")
    private java.math.BigDecimal tarif;

    public Abonnement() {
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public java.math.BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(java.math.BigDecimal tarif) {
        this.tarif = tarif;
    }
}
