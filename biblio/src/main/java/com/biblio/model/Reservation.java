package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private Integer id_reservation;
    @Column(name = "date_reservation")
    private java.time.LocalDateTime date_reservation;
    @Column(name = "date_debut")
    private java.time.LocalDateTime date_debut;
    @Column(name = "date_fin")
    private java.time.LocalDateTime date_fin;
    @Column(name = "id_adherent")
    private Integer id_adherent;
    @Column(name = "id_exemplaire")
    private Integer id_exemplaire;

    public Reservation() {}
    public Integer getId_reservation() { return id_reservation; }
    public void setId_reservation(Integer id_reservation) { this.id_reservation = id_reservation; }
    public java.time.LocalDateTime getDate_reservation() { return date_reservation; }
    public void setDate_reservation(java.time.LocalDateTime date_reservation) { this.date_reservation = date_reservation; }
    public java.time.LocalDateTime getDate_debut() { return date_debut; }
    public void setDate_debut(java.time.LocalDateTime date_debut) { this.date_debut = date_debut; }
    public java.time.LocalDateTime getDate_fin() { return date_fin; }
    public void setDate_fin(java.time.LocalDateTime date_fin) { this.date_fin = date_fin; }
    public Integer getId_adherent() { return id_adherent; }
    public void setId_adherent(Integer id_adherent) { this.id_adherent = id_adherent; }
    public Integer getId_exemplaire() { return id_exemplaire; }
    public void setId_exemplaire(Integer id_exemplaire) { this.id_exemplaire = id_exemplaire; }
}
