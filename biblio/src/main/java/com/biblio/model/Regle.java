package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Regle")
public class Regle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_regle")
    private Integer id_regle;
    @Column(name = "description")
    private String description;
    @Column(name = "nb_jour_duree_pret_max")
    private Integer nb_jour_duree_pret_max;
    @Column(name = "nb_livre_preter_max")
    private Integer nb_livre_preter_max;
    @Column(name = "nb_prolongement_pret_max")
    private Integer nb_prolongement_pret_max;
    @Column(name = "nb_jour_prolongement_max")
    private Integer nb_jour_prolongement_max;
    @Column(name = "datedelete")
    private java.time.LocalDateTime datedelete;

    public Regle() {}
    public Integer getId_regle() { return id_regle; }
    public void setId_regle(Integer id_regle) { this.id_regle = id_regle; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getNb_jour_duree_pret_max() { return nb_jour_duree_pret_max; }
    public void setNb_jour_duree_pret_max(Integer nb_jour_duree_pret_max) { this.nb_jour_duree_pret_max = nb_jour_duree_pret_max; }
    public Integer getNb_livre_preter_max() { return nb_livre_preter_max; }
    public void setNb_livre_preter_max(Integer nb_livre_preter_max) { this.nb_livre_preter_max = nb_livre_preter_max; }
    public Integer getNb_prolongement_pret_max() { return nb_prolongement_pret_max; }
    public void setNb_prolongement_pret_max(Integer nb_prolongement_pret_max) { this.nb_prolongement_pret_max = nb_prolongement_pret_max; }
    public Integer getNb_jour_prolongement_max() { return nb_jour_prolongement_max; }
    public void setNb_jour_prolongement_max(Integer nb_jour_prolongement_max) { this.nb_jour_prolongement_max = nb_jour_prolongement_max; }
    public java.time.LocalDateTime getDatedelete() { return datedelete; }
    public void setDatedelete(java.time.LocalDateTime datedelete) { this.datedelete = datedelete; }
}
