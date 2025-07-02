package com.biblio.model;

import java.io.Serializable;
import java.util.Objects;

public class ExemplaireTypePretId implements Serializable {

    private Long idExemplaire;
    private Long idTypePret;

    // Constructeurs, getters et setters

    public ExemplaireTypePretId() {
    }

    public ExemplaireTypePretId(Long idExemplaire, Long idTypePret) {
        this.idExemplaire = idExemplaire;
        this.idTypePret = idTypePret;
    }

    public Long getIdExemplaire() {
        return idExemplaire;
    }

    public void setIdExemplaire(Long idExemplaire) {
        this.idExemplaire = idExemplaire;
    }

    public Long getIdTypePret() {
        return idTypePret;
    }

    public void setIdTypePret(Long idTypePret) {
        this.idTypePret = idTypePret;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idExemplaire, idTypePret);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ExemplaireTypePretId that = (ExemplaireTypePretId) o;
        return Objects.equals(idExemplaire, that.idExemplaire) &&
                Objects.equals(idTypePret, that.idTypePret);
    }
}
