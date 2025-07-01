package com.biblio.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class ProfilRegleId implements Serializable {
    private Integer id_profil;
    private Integer id_regle;

    public ProfilRegleId() {}
    public Integer getId_profil() { return id_profil; }
    public void setId_profil(Integer id_profil) { this.id_profil=id_profil; }
    public Integer getId_regle() { return id_regle; }
    public void setId_regle(Integer id_regle) { this.id_regle=id_regle; }
}
