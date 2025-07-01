package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Historique_Statut_Reservation")
public class HistoriqueStatutReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historique")
    private Integer id_historique;
    @Column(name = "date_modif")
    private java.time.LocalDateTime date_modif;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "id_utilisateur")
    private Integer id_utilisateur;
    @Column(name = "id_statut")
    private Integer id_statut;
    @Column(name = "id_reservation")
    private Integer id_reservation;

    public HistoriqueStatutReservation() {}
    public Integer getId_historique() { return id_historique; }
    public void setId_historique(Integer id_historique) { this.id_historique = id_historique; }
    public java.time.LocalDateTime getDate_modif() { return date_modif; }
    public void setDate_modif(java.time.LocalDateTime date_modif) { this.date_modif = date_modif; }
    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }
    public Integer getId_utilisateur() { return id_utilisateur; }
    public void setId_utilisateur(Integer id_utilisateur) { this.id_utilisateur = id_utilisateur; }
    public Integer getId_statut() { return id_statut; }
    public void setId_statut(Integer id_statut) { this.id_statut = id_statut; }
    public Integer getId_reservation() { return id_reservation; }
    public void setId_reservation(Integer id_reservation) { this.id_reservation = id_reservation; }
}
