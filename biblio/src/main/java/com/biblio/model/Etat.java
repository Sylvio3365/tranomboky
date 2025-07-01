package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Etat")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etat")
    private Integer id_etat;
    @Column(name = "nom")
    private String nom;
    @Column(name = "deleted_at")
    private java.time.LocalDateTime deleted_at;

    public Etat() {}
    public Integer getId_etat() { return id_etat; }
    public void setId_etat(Integer id_etat) { this.id_etat = id_etat; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public java.time.LocalDateTime getDeleted_at() { return deleted_at; }
    public void setDeleted_at(java.time.LocalDateTime deleted_at) { this.deleted_at = deleted_at; }
}
