package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "RegleJf")
public class RegleJf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegleJf")
    private Long idRegleJf;

    @Column(name = "comportement", nullable = false)
    private int comportement;

    @Column(name = "dateModif", nullable = false)
    private Timestamp dateModif;

    // Getters and Setters
    public Long getIdRegleJf() {
        return idRegleJf;
    }

    public void setIdRegleJf(Long idRegleJf) {
        this.idRegleJf = idRegleJf;
    }

    public int getComportement() {
        return comportement;
    }

    public void setComportement(int comportement) {
        this.comportement = comportement;
    }

    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }
}
