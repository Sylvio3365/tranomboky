package com.biblio.model;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "StatutAdherent")
public class StatutAdherent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStatutAdherent")
    private Long idStatutAdherent;

    @Column(name = "dateModif", nullable = false)
    private Timestamp dateModif;

    @ManyToOne
    @JoinColumn(name = "idStatut", nullable = false)
    private Statut statut;

    @ManyToOne
    @JoinColumn(name = "idAdherent", nullable = false)
    private Adherent adherent;

    // Getters and Setters
    public Long getIdStatutAdherent() {
        return idStatutAdherent;
    }

    public void setIdStatutAdherent(Long idStatutAdherent) {
        this.idStatutAdherent = idStatutAdherent;
    }

    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}
