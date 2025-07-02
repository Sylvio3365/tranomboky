package com.biblio.model;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "AdherentAbonnement")
public class AdherentAbonnement {

    @Id
    @ManyToOne
    @JoinColumn(name = "idAdherent", nullable = false)
    private Adherent adherent;

    @Id
    @ManyToOne
    @JoinColumn(name = "idAbonnement", nullable = false)
    private Abonnement abonnement;

    @Column(name = "dateDePaiement", nullable = false)
    private Timestamp dateDePaiement;

    // Getters and Setters
    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public Timestamp getDateDePaiement() {
        return dateDePaiement;
    }

    public void setDateDePaiement(Timestamp dateDePaiement) {
        this.dateDePaiement = dateDePaiement;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adherent == null) ? 0 : adherent.hashCode());
        result = prime * result + ((abonnement == null) ? 0 : abonnement.hashCode());
        result = prime * result + ((dateDePaiement == null) ? 0 : dateDePaiement.hashCode());
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
        AdherentAbonnement other = (AdherentAbonnement) obj;
        if (adherent == null) {
            if (other.adherent != null)
                return false;
        } else if (!adherent.equals(other.adherent))
            return false;
        if (abonnement == null) {
            if (other.abonnement != null)
                return false;
        } else if (!abonnement.equals(other.abonnement))
            return false;
        if (dateDePaiement == null) {
            if (other.dateDePaiement != null)
                return false;
        } else if (!dateDePaiement.equals(other.dateDePaiement))
            return false;
        return true;
    }
}
