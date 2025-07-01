package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Historique_Etat_Exemplaire")
public class HistoriqueEtatExemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historique")
    private Integer id_historique;
    @Column(name = "date_modif")
    private java.time.LocalDateTime date_modif;
    @Column(name = "id_etat")
    private Integer id_etat;
    @Column(name = "id_exemplaire")
    private Integer id_exemplaire;

    public HistoriqueEtatExemplaire() {}
    public Integer getId_historique() { return id_historique; }
    public void setId_historique(Integer id_historique) { this.id_historique = id_historique; }
    public java.time.LocalDateTime getDate_modif() { return date_modif; }
    public void setDate_modif(java.time.LocalDateTime date_modif) { this.date_modif = date_modif; }
    public Integer getId_etat() { return id_etat; }
    public void setId_etat(Integer id_etat) { this.id_etat = id_etat; }
    public Integer getId_exemplaire() { return id_exemplaire; }
    public void setId_exemplaire(Integer id_exemplaire) { this.id_exemplaire = id_exemplaire; }
}
