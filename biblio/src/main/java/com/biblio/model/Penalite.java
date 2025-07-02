package com.biblio.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Penalite")
public class Penalite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPenalite")
    private Long idPenalite;

    @Column(name = "nbJourDePenalite", nullable = false)
    private int nbJourDePenalite;

    @Column(name = "motif", length = 100)
    private String motif;

    @Column(name = "dateDelete")
    private Timestamp dateDelete;

    // Getters and Setters
    public Long getIdPenalite() {
        return idPenalite;
    }

    public void setIdPenalite(Long idPenalite) {
        this.idPenalite = idPenalite;
    }

    public int getNbJourDePenalite() {
        return nbJourDePenalite;
    }

    public void setNbJourDePenalite(int nbJourDePenalite) {
        this.nbJourDePenalite = nbJourDePenalite;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPenalite == null) ? 0 : idPenalite.hashCode());
        result = prime * result + nbJourDePenalite;
        result = prime * result + ((motif == null) ? 0 : motif.hashCode());
        result = prime * result + ((dateDelete == null) ? 0 : dateDelete.hashCode());
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
        Penalite other = (Penalite) obj;
        if (idPenalite == null) {
            if (other.idPenalite != null)
                return false;
        } else if (!idPenalite.equals(other.idPenalite))
            return false;
        if (nbJourDePenalite != other.nbJourDePenalite)
            return false;
        if (motif == null) {
            if (other.motif != null)
                return false;
        } else if (!motif.equals(other.motif))
            return false;
        if (dateDelete == null) {
            if (other.dateDelete != null)
                return false;
        } else if (!dateDelete.equals(other.dateDelete))
            return false;
        return true;
    }
}
