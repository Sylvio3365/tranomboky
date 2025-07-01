package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer id_role;
    @Column(name = "nom")
    private String nom;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Role() {}
    public Integer getId_role() { return id_role; }
    public void setId_role(Integer id_role) { this.id_role = id_role; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
