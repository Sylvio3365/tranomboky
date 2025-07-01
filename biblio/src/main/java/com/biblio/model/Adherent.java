package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdherent;

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;

    @ManyToOne
    @JoinColumn(name = "idProfil")
    private Profil profil;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    private LocalDateTime dateDelete;
}
