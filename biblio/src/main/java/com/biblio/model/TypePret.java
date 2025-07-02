package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TypePret")
public class TypePret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTypePret")
    private Long idTypePret;

    @Column(name = "nom", nullable = false, length = 50, unique = true)
    private String nom;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdTypePret() {
        return idTypePret;
    }

    public void setIdTypePret(Long idTypePret) {
        this.idTypePret = idTypePret;
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
