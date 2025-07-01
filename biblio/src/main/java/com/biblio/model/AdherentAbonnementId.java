package com.biblio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class AdherentAbonnementId implements Serializable {
    private Integer id_adherent;
    private Integer id_abonnement;

    public AdherentAbonnementId() {}
    public Integer getId_adherent() { return id_adherent; }
    public void setId_adherent(Integer id_adherent) { this.id_adherent=id_adherent; }
    public Integer getId_abonnement() { return id_abonnement; }
    public void setId_abonnement(Integer id_abonnement) { this.id_abonnement=id_abonnement; }
}
