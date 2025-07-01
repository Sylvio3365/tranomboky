package com.biblio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class TypePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTypePret;

    private String nom;
    private LocalDateTime dateDelete;
}
