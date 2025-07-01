package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Sanction")
public class Sanction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sanction")
    private Integer id_sanction;
    @Column(name = "motif")
    private String motif;
    @Column(name = "date_debut")
    private java.time.LocalDateTime date_debut;
    @Column(name = "date_fin")
    private java.time.LocalDateTime date_fin;
    @Column(name = "date_sanction")
    private java.time.LocalDateTime date_sanction;
    @Column(name = "id_adherent")
    private Integer id_adherent;

    public Sanction() {}
    public Integer getId_sanction() { return id_sanction; }
    public void setId_sanction(Integer id_sanction) { this.id_sanction = id_sanction; }
    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }
    public java.time.LocalDateTime getDate_debut() { return date_debut; }
    public void setDate_debut(java.time.LocalDateTime date_debut) { this.date_debut = date_debut; }
    public java.time.LocalDateTime getDate_fin() { return date_fin; }
    public void setDate_fin(java.time.LocalDateTime date_fin) { this.date_fin = date_fin; }
    public java.time.LocalDateTime getDate_sanction() { return date_sanction; }
    public void setDate_sanction(java.time.LocalDateTime date_sanction) { this.date_sanction = date_sanction; }
    public Integer getId_adherent() { return id_adherent; }
    public void setId_adherent(Integer id_adherent) { this.id_adherent = id_adherent; }
}
