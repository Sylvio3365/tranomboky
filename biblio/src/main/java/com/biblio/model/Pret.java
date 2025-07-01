package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Pret")
public class Pret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pret")
    private Integer id_pret;
    @Column(name = "date_debut")
    private java.time.LocalDateTime date_debut;
    @Column(name = "date_fin")
    private java.time.LocalDateTime date_fin;
    @Column(name = "id_type_pret")
    private Integer id_type_pret;
    @Column(name = "id_adherent")
    private Integer id_adherent;
    @Column(name = "id_exemplaire")
    private Integer id_exemplaire;

    public Pret() {}
    public Integer getId_pret() { return id_pret; }
    public void setId_pret(Integer id_pret) { this.id_pret = id_pret; }
    public java.time.LocalDateTime getDate_debut() { return date_debut; }
    public void setDate_debut(java.time.LocalDateTime date_debut) { this.date_debut = date_debut; }
    public java.time.LocalDateTime getDate_fin() { return date_fin; }
    public void setDate_fin(java.time.LocalDateTime date_fin) { this.date_fin = date_fin; }
    public Integer getId_type_pret() { return id_type_pret; }
    public void setId_type_pret(Integer id_type_pret) { this.id_type_pret = id_type_pret; }
    public Integer getId_adherent() { return id_adherent; }
    public void setId_adherent(Integer id_adherent) { this.id_adherent = id_adherent; }
    public Integer getId_exemplaire() { return id_exemplaire; }
    public void setId_exemplaire(Integer id_exemplaire) { this.id_exemplaire = id_exemplaire; }
}
