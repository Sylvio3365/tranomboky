package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Restriction")
public class Restriction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestriction")
    private Long idRestriction;

    @Column(name = "ageMin", nullable = false)
    private int ageMin;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdRestriction() {
        return idRestriction;
    }

    public void setIdRestriction(Long idRestriction) {
        this.idRestriction = idRestriction;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }
}
