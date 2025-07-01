package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livre")
    private Integer id_livre;
    @Column(name = "titre")
    private String titre;
    @Column(name = "auteur")
    private String auteur;

    public Livre() {}
    public Integer getId_livre() { return id_livre; }
    public void setId_livre(Integer id_livre) { this.id_livre = id_livre; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
}
