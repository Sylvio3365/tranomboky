package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "JourFerie")
public class JourFerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJourFerie")
    private Long idJourFerie;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "dateJf", nullable = false, unique = true)
    private java.sql.Date dateJf;

    // Getters and Setters
    public Long getIdJourFerie() {
        return idJourFerie;
    }

    public void setIdJourFerie(Long idJourFerie) {
        this.idJourFerie = idJourFerie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Date getDateJf() {
        return dateJf;
    }

    public void setDateJf(java.sql.Date dateJf) {
        this.dateJf = dateJf;
    }
}
