package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur;

    private String username;
    private String mdp;

    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;

    private LocalDateTime dateDelete;
}
