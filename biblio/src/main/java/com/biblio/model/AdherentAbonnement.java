package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Adherent_Abonnement")
public class AdherentAbonnement {
    @EmbeddedId
    private AdherentAbonnementId id;
    @Column(name = "date_de_paiement")
    private java.time.LocalDateTime date_de_paiement;

    public AdherentAbonnement() {}
    public AdherentAbonnementId getId() { return id; }
    public void setId(AdherentAbonnementId id) { this.id = id; }
    public java.time.LocalDateTime getDate_de_paiement() { return date_de_paiement; }
    public void setDate_de_paiement(java.time.LocalDateTime date_de_paiement) { this.date_de_paiement = date_de_paiement; }
}
