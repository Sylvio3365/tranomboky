package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Pret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPret;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    @ManyToOne
    @JoinColumn(name = "idTypePret")
    private TypePret typePret;

    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent adherent;

    @ManyToOne
    @JoinColumn(name = "idExemplaire")
    private Exemplaire exemplaire;
}
