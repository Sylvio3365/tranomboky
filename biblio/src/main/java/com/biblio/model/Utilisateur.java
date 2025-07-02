package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUtilisateur")
    private Long idUtilisateur;

    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name = "mdp", nullable = false, length = 50)
    private String mdp;

    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private Role role;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }
}
