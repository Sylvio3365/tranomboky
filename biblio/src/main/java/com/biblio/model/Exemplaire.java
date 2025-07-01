package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Exemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExemplaire;

    private String code;

    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre livre;

    private LocalDateTime dateDelete;
}
