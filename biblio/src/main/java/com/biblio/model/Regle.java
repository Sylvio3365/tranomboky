package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Regle")
public class Regle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegle")
    private Long idRegle;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "nbJourDureePretMax", nullable = false)
    private int nbJourDureePretMax;

    @Column(name = "nbLivrePreterMax", nullable = false)
    private int nbLivrePreterMax;

    @Column(name = "nbProlongementPretMax", nullable = false)
    private int nbProlongementPretMax;

    @Column(name = "nbJourProlongementMax", nullable = false)
    private int nbJourProlongementMax;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdRegle() {
        return idRegle;
    }

    public void setIdRegle(Long idRegle) {
        this.idRegle = idRegle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbJourDureePretMax() {
        return nbJourDureePretMax;
    }

    public void setNbJourDureePretMax(int nbJourDureePretMax) {
        this.nbJourDureePretMax = nbJourDureePretMax;
    }

    public int getNbLivrePreterMax() {
        return nbLivrePreterMax;
    }

    public void setNbLivrePreterMax(int nbLivrePreterMax) {
        this.nbLivrePreterMax = nbLivrePreterMax;
    }

    public int getNbProlongementPretMax() {
        return nbProlongementPretMax;
    }

    public void setNbProlongementPretMax(int nbProlongementPretMax) {
        this.nbProlongementPretMax = nbProlongementPretMax;
    }

    public int getNbJourProlongementMax() {
        return nbJourProlongementMax;
    }

    public void setNbJourProlongementMax(int nbJourProlongementMax) {
        this.nbJourProlongementMax = nbJourProlongementMax;
    }

    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }
}
