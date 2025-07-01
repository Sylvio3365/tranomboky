package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Restriction")
public class Restriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restriction")
    private Integer id_restriction;
    @Column(name = "age_min")
    private Integer age_min;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Restriction() {}
    public Integer getId_restriction() { return id_restriction; }
    public void setId_restriction(Integer id_restriction) { this.id_restriction = id_restriction; }
    public Integer getAge_min() { return age_min; }
    public void setAge_min(Integer age_min) { this.age_min = age_min; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
