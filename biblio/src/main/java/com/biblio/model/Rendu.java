package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Rendu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRendu;

    private LocalDateTime dateRendu;

    @OneToOne
    @JoinColumn(name = "idPret")
    private Pret pret;
}
