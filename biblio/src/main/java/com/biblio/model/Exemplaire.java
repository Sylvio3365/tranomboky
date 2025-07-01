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
    private Integer id_exemplaire;
    @Column(name = "code")
    private String code;
    @Column(name = "id_livre")
    private Integer id_livre;
    @Column(name = "deleted_at")
    private java.time.LocalDateTime deleted_at;

    public Exemplaire() {}
    public Integer getId_exemplaire() { return id_exemplaire; }
    public void setId_exemplaire(Integer id_exemplaire) { this.id_exemplaire = id_exemplaire; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public Integer getId_livre() { return id_livre; }
    public void setId_livre(Integer id_livre) { this.id_livre = id_livre; }
    public java.time.LocalDateTime getDeleted_at() { return deleted_at; }
    public void setDeleted_at(java.time.LocalDateTime deleted_at) { this.deleted_at = deleted_at; }
}
