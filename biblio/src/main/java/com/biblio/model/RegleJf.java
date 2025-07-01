package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Regle_JF")
public class RegleJf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_regle_jf")
    private Integer id_regle_jf;
    @Column(name = "comportement")
    private Integer comportement;
    @Column(name = "date_modif")
    private java.time.LocalDateTime date_modif;

    public RegleJf() {}
    public Integer getId_regle_jf() { return id_regle_jf; }
    public void setId_regle_jf(Integer id_regle_jf) { this.id_regle_jf = id_regle_jf; }
    public Integer getComportement() { return comportement; }
    public void setComportement(Integer comportement) { this.comportement = comportement; }
    public java.time.LocalDateTime getDate_modif() { return date_modif; }
    public void setDate_modif(java.time.LocalDateTime date_modif) { this.date_modif = date_modif; }
}
