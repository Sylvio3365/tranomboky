package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Statut")
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStatut")
    private Long idStatut;

    @Column(name = "nom", nullable = false, length = 20, unique = true)
    private String nom;

    // Getters and Setters
    public Long getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(Long idStatut) {
        this.idStatut = idStatut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
