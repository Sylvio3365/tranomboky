package com.biblio.model;

import jakarta.persistence.*;
import java.time.*;
import java.math.*;

@Entity
@Table(name = "Profil_Regle")
public class ProfilRegle {
    @EmbeddedId
    private ProfilRegleId id;

    public ProfilRegle() {}
    public ProfilRegleId getId() { return id; }
    public void setId(ProfilRegleId id) { this.id = id; }
}
