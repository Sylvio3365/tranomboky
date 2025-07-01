package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Jour_Ferie")
public class JourFerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jour_ferie")
    private Integer id_jour_ferie;
    @Column(name = "description")
    private String description;
    @Column(name = "date_jf")
    private java.time.LocalDate date_jf;

    public JourFerie() {}
    public Integer getId_jour_ferie() { return id_jour_ferie; }
    public void setId_jour_ferie(Integer id_jour_ferie) { this.id_jour_ferie = id_jour_ferie; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public java.time.LocalDate getDate_jf() { return date_jf; }
    public void setDate_jf(java.time.LocalDate date_jf) { this.date_jf = date_jf; }
}
