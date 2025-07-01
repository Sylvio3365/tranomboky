package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Prolongement")
public class Prolongement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prolongement")
    private Integer id_prolongement;
    @Column(name = "nouvelle_date_fin")
    private java.time.LocalDateTime nouvelle_date_fin;
    @Column(name = "date_prolongement")
    private java.time.LocalDateTime date_prolongement;
    @Column(name = "id_pret")
    private Integer id_pret;

    public Prolongement() {}
    public Integer getId_prolongement() { return id_prolongement; }
    public void setId_prolongement(Integer id_prolongement) { this.id_prolongement = id_prolongement; }
    public java.time.LocalDateTime getNouvelle_date_fin() { return nouvelle_date_fin; }
    public void setNouvelle_date_fin(java.time.LocalDateTime nouvelle_date_fin) { this.nouvelle_date_fin = nouvelle_date_fin; }
    public java.time.LocalDateTime getDate_prolongement() { return date_prolongement; }
    public void setDate_prolongement(java.time.LocalDateTime date_prolongement) { this.date_prolongement = date_prolongement; }
    public Integer getId_pret() { return id_pret; }
    public void setId_pret(Integer id_pret) { this.id_pret = id_pret; }
}
