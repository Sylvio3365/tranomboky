package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Profil_Penalite")
public class ProfilPenalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profil_penalite")
    private Integer id_profil_penalite;
    @Column(name = "date_modif")
    private java.time.LocalDateTime date_modif;
    @Column(name = "id_penalite")
    private Integer id_penalite;
    @Column(name = "id_profil")
    private Integer id_profil;

    public ProfilPenalite() {}
    public Integer getId_profil_penalite() { return id_profil_penalite; }
    public void setId_profil_penalite(Integer id_profil_penalite) { this.id_profil_penalite = id_profil_penalite; }
    public java.time.LocalDateTime getDate_modif() { return date_modif; }
    public void setDate_modif(java.time.LocalDateTime date_modif) { this.date_modif = date_modif; }
    public Integer getId_penalite() { return id_penalite; }
    public void setId_penalite(Integer id_penalite) { this.id_penalite = id_penalite; }
    public Integer getId_profil() { return id_profil; }
    public void setId_profil(Integer id_profil) { this.id_profil = id_profil; }
}
