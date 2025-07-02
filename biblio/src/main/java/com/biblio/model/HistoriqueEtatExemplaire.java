package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "HistoriqueEtatExemplaire")
public class HistoriqueEtatExemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHistorique")
    private Long idHistorique;

    @Column(name = "dateModif", nullable = false)
    private Timestamp dateModif;

    @ManyToOne
    @JoinColumn(name = "idEtat", nullable = false)
    private Etat etat;

    @ManyToOne
    @JoinColumn(name = "idExemplaire", nullable = false)
    private Exemplaire exemplaire;

    // Getters and Setters
    public Long getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(Long idHistorique) {
        this.idHistorique = idHistorique;
    }

    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }
}
