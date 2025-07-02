package com.biblio.model;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "ProfilPenalite")
public class ProfilPenalite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfilPenalite")
    private Long idProfilPenalite;

    @Column(name = "dateModif", nullable = false)
    private Timestamp dateModif;

    @ManyToOne
    @JoinColumn(name = "idPenalite", nullable = false)
    private Penalite penalite;

    @ManyToOne
    @JoinColumn(name = "idProfil", nullable = false)
    private Profil profil;

    // Getters and Setters
    public Long getIdProfilPenalite() {
        return idProfilPenalite;
    }

    public void setIdProfilPenalite(Long idProfilPenalite) {
        this.idProfilPenalite = idProfilPenalite;
    }

    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    public Penalite getPenalite() {
        return penalite;
    }

    public void setPenalite(Penalite penalite) {
        this.penalite = penalite;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}
