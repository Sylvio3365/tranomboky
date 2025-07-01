package com.biblio.service;

import com.biblio.model.Utilisateur;
import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> findAll();
    Utilisateur findById(Integer id);
    Utilisateur save(Utilisateur obj);
    void deleteById(Integer id);
}
