package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Penalite")
public class Penalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_penalite")
    private Integer id_penalite;
    @Column(name = "nb_jour_de_penalite")
    private Integer nb_jour_de_penalite;
    @Column(name = "motif")
    private String motif;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Penalite() {}
    public Integer getId_penalite() { return id_penalite; }
    public void setId_penalite(Integer id_penalite) { this.id_penalite = id_penalite; }
    public Integer getNb_jour_de_penalite() { return nb_jour_de_penalite; }
    public void setNb_jour_de_penalite(Integer nb_jour_de_penalite) { this.nb_jour_de_penalite = nb_jour_de_penalite; }
    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
