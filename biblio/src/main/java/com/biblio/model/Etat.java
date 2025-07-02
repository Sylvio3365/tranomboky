package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Etat")
public class Etat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtat")
    private Long idEtat;

    @Column(name = "nom", nullable = false, length = 50, unique = true)
    private String nom;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdEtat() {
        return idEtat;
    }

    public void setIdEtat(Long idEtat) {
        this.idEtat = idEtat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }
}
