package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Profil")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profil")
    private Integer id_profil;
    @Column(name = "nom")
    private String nom;
    @Column(name = "deleted_at")
    private java.time.LocalDateTime deleted_at;

    public Profil() {}
    public Integer getId_profil() { return id_profil; }
    public void setId_profil(Integer id_profil) { this.id_profil = id_profil; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public java.time.LocalDateTime getDeleted_at() { return deleted_at; }
    public void setDeleted_at(java.time.LocalDateTime deleted_at) { this.deleted_at = deleted_at; }
}
