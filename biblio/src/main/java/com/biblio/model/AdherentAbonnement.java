package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class AdherentAbonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent adherent;

    @ManyToOne
    @JoinColumn(name = "idAbonnement")
    private Abonnement abonnement;

    private LocalDateTime dateDePaiement;
}
