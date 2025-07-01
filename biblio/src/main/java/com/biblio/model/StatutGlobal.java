package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Statut_Global")
public class StatutGlobal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_statut")
    private Integer id_statut;
    @Column(name = "nom")
    private String nom;

    public StatutGlobal() {}
    public Integer getId_statut() { return id_statut; }
    public void setId_statut(Integer id_statut) { this.id_statut = id_statut; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}
