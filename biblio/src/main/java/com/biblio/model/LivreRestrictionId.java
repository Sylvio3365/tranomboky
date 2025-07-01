package com.biblio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class LivreRestrictionId implements Serializable {
    private Integer id_livre;
    private Integer id_restriction;

    public LivreRestrictionId() {}
    public Integer getId_livre() { return id_livre; }
    public void setId_livre(Integer id_livre) { this.id_livre=id_livre; }
    public Integer getId_restriction() { return id_restriction; }
    public void setId_restriction(Integer id_restriction) { this.id_restriction=id_restriction; }
}
