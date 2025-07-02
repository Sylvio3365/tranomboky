package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "LivreRestriction")
public class LivreRestriction {

    @Id
    @ManyToOne
    @JoinColumn(name = "idLivre", nullable = false)
    private Livre livre;

    @Id
    @ManyToOne
    @JoinColumn(name = "idRestriction", nullable = false)
    private Restriction restriction;

    // Getters and Setters
    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Restriction getRestriction() {
        return restriction;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((livre == null) ? 0 : livre.hashCode());
        result = prime * result + ((restriction == null) ? 0 : restriction.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LivreRestriction other = (LivreRestriction) obj;
        if (livre == null) {
            if (other.livre != null)
                return false;
        } else if (!livre.equals(other.livre))
            return false;
        if (restriction == null) {
            if (other.restriction != null)
                return false;
        } else if (!restriction.equals(other.restriction))
            return false;
        return true;
    }
}
