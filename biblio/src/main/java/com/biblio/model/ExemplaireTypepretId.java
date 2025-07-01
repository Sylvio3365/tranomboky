package com.biblio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class ExemplaireTypepretId implements Serializable {
    private Integer id_exemplaire;
    private Integer id_type_pret;

    public ExemplaireTypepretId() {}
    public Integer getId_exemplaire() { return id_exemplaire; }
    public void setId_exemplaire(Integer id_exemplaire) { this.id_exemplaire=id_exemplaire; }
    public Integer getId_type_pret() { return id_type_pret; }
    public void setId_type_pret(Integer id_type_pret) { this.id_type_pret=id_type_pret; }
}
