package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Adherent")
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adherent")
    private Integer idAdherent;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "date_de_naissance")
    private java.time.LocalDate date_de_naissance;
    @Column(name = "id_profil")
    private Integer id_profil;
    @Column(name = "id_utilisateur")
    private Integer id_utilisateur;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Adherent() {
    }

    public String getNom() {
        return nom;
    }

    public Integer getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(Integer idAdherent) {
        this.idAdherent = idAdherent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public java.time.LocalDate getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(java.time.LocalDate date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public Integer getId_profil() {
        return id_profil;
    }

    public void setId_profil(Integer id_profil) {
        this.id_profil = id_profil;
    }

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public java.time.LocalDateTime getDatedelete() {
        return datedelete;
    }

    public void setDatedelete(java.time.LocalDateTime datedelete) {
        this.datedelete = datedelete;
    }
}
