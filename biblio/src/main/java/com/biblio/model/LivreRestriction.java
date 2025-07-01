package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Livre_Restriction")
public class LivreRestriction {
    @EmbeddedId
    private LivreRestrictionId id;

    public LivreRestriction() {}
    public LivreRestrictionId getId() { return id; }
    public void setId(LivreRestrictionId id) { this.id = id; }
}
