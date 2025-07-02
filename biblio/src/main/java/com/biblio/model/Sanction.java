package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Sanction")
public class Sanction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSanction")
    private Long idSanction;

    @Column(name = "motif", length = 100)
    private String motif;

    @Column(name = "dateDebut", nullable = false)
    private Timestamp dateDebut;

    @Column(name = "dateFin", nullable = false)
    private Timestamp dateFin;

    @Column(name = "dateSanction", nullable = false)
    private Timestamp dateSanction;

    @ManyToOne
    @JoinColumn(name = "idAdherent", nullable = false)
    private Adherent adherent;

    // Getters and Setters
    public Long getIdSanction() {
        return idSanction;
    }

    public void setIdSanction(Long idSanction) {
        this.idSanction = idSanction;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Timestamp getDateFin() {
        return dateFin;
    }

    public void setDateFin(Timestamp dateFin) {
        this.dateFin = dateFin;
    }

    public Timestamp getDateSanction() {
        return dateSanction;
    }

    public void setDateSanction(Timestamp dateSanction) {
        this.dateSanction = dateSanction;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}
