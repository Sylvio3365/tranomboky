package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Exemplaire_TypePret")
public class ExemplaireTypepret {
    @EmbeddedId
    private ExemplaireTypepretId id;

    public ExemplaireTypepret() {}
    public ExemplaireTypepretId getId() { return id; }
    public void setId(ExemplaireTypepretId id) { this.id = id; }
}
