package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Exemplaire")
public class Exemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exemplaire")
    private Integer idExemplaire;
    public Integer getIdExemplaire() {
        return idExemplaire;
    }
    public void setIdExemplaire(Integer idExemplaire) {
        this.idExemplaire = idExemplaire;
    }
    @Column(name = "code")
    private String code;
    @Column(name = "id_livre")
    private Integer id_livre;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Exemplaire() {}
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public Integer getId_livre() { return id_livre; }
    public void setId_livre(Integer id_livre) { this.id_livre = id_livre; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
