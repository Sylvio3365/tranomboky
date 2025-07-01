package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Rendu")
public class Rendu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rendu")
    private Integer id_rendu;
    @Column(name = "date_rendu")
    private java.time.LocalDateTime date_rendu;
    @Column(name = "id_pret")
    private Integer id_pret;

    public Rendu() {}
    public Integer getId_rendu() { return id_rendu; }
    public void setId_rendu(Integer id_rendu) { this.id_rendu = id_rendu; }
    public java.time.LocalDateTime getDate_rendu() { return date_rendu; }
    public void setDate_rendu(java.time.LocalDateTime date_rendu) { this.date_rendu = date_rendu; }
    public Integer getId_pret() { return id_pret; }
    public void setId_pret(Integer id_pret) { this.id_pret = id_pret; }
}
