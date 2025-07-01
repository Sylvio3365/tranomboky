package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAbonnement;

    private Integer mois;
    private Integer annee;
    private Double tarif;
}
