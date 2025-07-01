package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "TypePret")
public class Typepret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_pret")
    private Integer id_type_pret;
    @Column(name = "nom")
    private String nom;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Typepret() {}
    public Integer getId_type_pret() { return id_type_pret; }
    public void setId_type_pret(Integer id_type_pret) { this.id_type_pret = id_type_pret; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
