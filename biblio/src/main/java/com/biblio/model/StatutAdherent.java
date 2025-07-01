package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Statut_Adherent")
public class StatutAdherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_statut_adherent")
    private Integer id_statut_adherent;
    @Column(name = "date_modif")
    private java.time.LocalDateTime date_modif;
    @Column(name = "id_statut")
    private Integer id_statut;
    @Column(name = "id_adherent")
    private Integer id_adherent;

    public StatutAdherent() {}
    public Integer getId_statut_adherent() { return id_statut_adherent; }
    public void setId_statut_adherent(Integer id_statut_adherent) { this.id_statut_adherent = id_statut_adherent; }
    public java.time.LocalDateTime getDate_modif() { return date_modif; }
    public void setDate_modif(java.time.LocalDateTime date_modif) { this.date_modif = date_modif; }
    public Integer getId_statut() { return id_statut; }
    public void setId_statut(Integer id_statut) { this.id_statut = id_statut; }
    public Integer getId_adherent() { return id_adherent; }
    public void setId_adherent(Integer id_adherent) { this.id_adherent = id_adherent; }
}
