package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ExemplaireTypePret")
@IdClass(ExemplaireTypePretId.class) // Indique la classe de la clé composite
public class ExemplaireTypePret {

    @Id
    @ManyToOne
    @JoinColumn(name = "idExemplaire", nullable = false)
    private Exemplaire exemplaire;

    @Id
    @ManyToOne
    @JoinColumn(name = "idTypePret", nullable = false)
    private TypePret typePret;

    // Constructeur sans argument (requis pour JPA)
    public ExemplaireTypePret() {
    }

    // Getters and Setters
    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    public TypePret getTypePret() {
        return typePret;
    }

    public void setTypePret(TypePret typePret) {
        this.typePret = typePret;
    }

    // Ces propriétés ne doivent pas être persistées, elles sont là pour la
    // correspondance de l'ID composite
    @Transient
    public Long getIdExemplaire() {
        return exemplaire != null ? exemplaire.getIdExemplaire() : null;
    }

    @Transient
    public Long getIdTypePret() {
        return typePret != null ? typePret.getIdTypePret() : null;
    }
}
