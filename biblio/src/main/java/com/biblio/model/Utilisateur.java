package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Integer id_utilisateur;
    @Column(name = "username")
    private String username;
    @Column(name = "mdp")
    private String mdp;
    @Column(name = "id_role")
    private Integer id_role;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Utilisateur() {}
    public Integer getId_utilisateur() { return id_utilisateur; }
    public void setId_utilisateur(Integer id_utilisateur) { this.id_utilisateur = id_utilisateur; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getMdp() { return mdp; }
    public void setMdp(String mdp) { this.mdp = mdp; }
    public Integer getId_role() { return id_role; }
    public void setId_role(Integer id_role) { this.id_role = id_role; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
