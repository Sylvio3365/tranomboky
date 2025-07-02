package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Pret")
public class Pret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPret")
    private Long idPret;

    @Column(name = "dateDebut", nullable = false)
    private Timestamp dateDebut;

    @Column(name = "dateFin", nullable = false)
    private Timestamp dateFin;

    @ManyToOne
    @JoinColumn(name = "idTypePret", nullable = false)
    private TypePret typePret;

    @ManyToOne
    @JoinColumn(name = "idAdherent", nullable = false)
    private Adherent adherent;

    @ManyToOne
    @JoinColumn(name = "idExemplaire", nullable = false)
    private Exemplaire exemplaire;

    // Getters and Setters
    public Long getIdPret() {
        return idPret;
    }

    public void setIdPret(Long idPret) {
        this.idPret = idPret;
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

    public TypePret getTypePret() {
        return typePret;
    }

    public void setTypePret(TypePret typePret) {
        this.typePret = typePret;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }
}
