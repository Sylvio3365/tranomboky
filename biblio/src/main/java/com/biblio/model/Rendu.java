package com.biblio.model;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "Rendu")
public class Rendu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRendu")
    private Long idRendu;

    @Column(name = "dateRendu", nullable = false)
    private Timestamp dateRendu;

    @OneToOne
    @JoinColumn(name = "idPret", nullable = false)
    private Pret pret;

    // Getters and Setters
    public Long getIdRendu() {
        return idRendu;
    }

    public void setIdRendu(Long idRendu) {
        this.idRendu = idRendu;
    }

    public Timestamp getDateRendu() {
        return dateRendu;
    }

    public void setDateRendu(Timestamp dateRendu) {
        this.dateRendu = dateRendu;
    }

    public Pret getPret() {
        return pret;
    }

    public void setPret(Pret pret) {
        this.pret = pret;
    }
}
