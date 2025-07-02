package com.biblio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ProfilRegle")
public class ProfilRegle {

    @Id
    @ManyToOne
    @JoinColumn(name = "idProfil", nullable = false)
    private Profil profil;

    @Id
    @ManyToOne
    @JoinColumn(name = "idRegle", nullable = false)
    private Regle regle;

    // Getters and Setters
    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public Regle getRegle() {
        return regle;
    }

    public void setRegle(Regle regle) {
        this.regle = regle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((profil == null) ? 0 : profil.hashCode());
        result = prime * result + ((regle == null) ? 0 : regle.hashCode());
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
        ProfilRegle other = (ProfilRegle) obj;
        if (profil == null) {
            if (other.profil != null)
                return false;
        } else if (!profil.equals(other.profil))
            return false;
        if (regle == null) {
            if (other.regle != null)
                return false;
        } else if (!regle.equals(other.regle))
            return false;
        return true;
    }
}
