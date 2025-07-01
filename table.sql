-- LIVRES ET EXEMPLAIRES
CREATE TABLE
    Livre (
        id_livre SERIAL PRIMARY KEY,
        titre VARCHAR(100) NOT NULL,
        auteur VARCHAR(100)
    );

CREATE TABLE
    Exemplaire (
        id_exemplaire SERIAL PRIMARY KEY,
        code VARCHAR(50) UNIQUE NOT NULL,
        id_livre INT NOT NULL,
        CONSTRAINT fk_ex_livre FOREIGN KEY (id_livre) REFERENCES Livre (id_livre)
    );

-- RESTRICTION D'ÂGE
CREATE TABLE
    Restriction (
        id_restriction SERIAL PRIMARY KEY,
        age_min INT NOT NULL
    );

CREATE TABLE
    Livre_Restriction (
        id_livre INT NOT NULL,
        id_restriction INT NOT NULL,
        PRIMARY KEY (id_livre, id_restriction),
        CONSTRAINT fk_lr_livre FOREIGN KEY (id_livre) REFERENCES Livre (id_livre),
        CONSTRAINT fk_lr_restriction FOREIGN KEY (id_restriction) REFERENCES Restriction (id_restriction)
    );

-- REGLES
CREATE TABLE
    Regle (
        id_regle SERIAL PRIMARY KEY,
        description VARCHAR(100),
        nb_jour_duree_pret_max INT NOT NULL,
        nb_livre_preter_max INT NOT NULL,
        nb_prolongement_pret_max INT NOT NULL,
        nb_jour_prolongement_max INT NOT NULL
    );

-- (Table Livre_Regle SUPPRIMÉE)
-- TYPE DE PRET
CREATE TABLE
    TypePret (
        id_type_pret SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Exemplaire_TypePret (
        id_exemplaire INT NOT NULL,
        id_type_pret INT NOT NULL,
        PRIMARY KEY (id_exemplaire, id_type_pret),
        CONSTRAINT fk_etp_exemplaire FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        CONSTRAINT fk_etp_typepret FOREIGN KEY (id_type_pret) REFERENCES TypePret (id_type_pret)
    );

-- ETAT D'UN EXEMPLAIRE
CREATE TABLE
    Etat (
        id_etat SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Historique_Etat_Exemplaire (
        id_historique SERIAL PRIMARY KEY,
        id_exemplaire INT NOT NULL,
        id_etat INT NOT NULL,
        date_modif TIMESTAMP NOT NULL,
        CONSTRAINT fk_hee_exemplaire FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        CONSTRAINT fk_hee_etat FOREIGN KEY (id_etat) REFERENCES Etat (id_etat)
    );

-- PROFIL, REGLE, PENALITE
CREATE TABLE
    Profil (
        id_profil SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Profil_Regle (
        id_profil INT NOT NULL,
        id_regle INT NOT NULL,
        PRIMARY KEY (id_profil, id_regle),
        CONSTRAINT fk_pr_profil FOREIGN KEY (id_profil) REFERENCES Profil (id_profil),
        CONSTRAINT fk_pr_regle FOREIGN KEY (id_regle) REFERENCES Regle (id_regle)
    );

CREATE TABLE
    Penalite (
        id_penalite SERIAL PRIMARY KEY,
        nb_jour_de_penalite INT NOT NULL,
        motif VARCHAR(100)
    );

CREATE TABLE
    Profil_Penalite (
        id_profil_penalite SERIAL PRIMARY KEY,
        id_profil INT NOT NULL,
        id_penalite INT NOT NULL,
        date_modif TIMESTAMP NOT NULL,
        CONSTRAINT fk_pp_profil FOREIGN KEY (id_profil) REFERENCES Profil (id_profil),
        CONSTRAINT fk_pp_penalite FOREIGN KEY (id_penalite) REFERENCES Penalite (id_penalite)
    );

-- UTILISATEURS, ROLES, ADHERENTS
CREATE TABLE
    Role (
        id_role SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Utilisateur (
        id_utilisateur SERIAL PRIMARY KEY,
        username VARCHAR(50) NOT NULL UNIQUE,
        mdp VARCHAR(50) NOT NULL,
        id_role INT NOT NULL,
        CONSTRAINT fk_ut_role FOREIGN KEY (id_role) REFERENCES Role (id_role)
    );

CREATE TABLE
    Adherent (
        id_adherent SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL,
        prenom VARCHAR(50) NOT NULL,
        date_de_naissance DATE NOT NULL,
        id_utilisateur INT,
        id_profil INT NOT NULL,
        CONSTRAINT fk_adh_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur),
        CONSTRAINT fk_adh_profil FOREIGN KEY (id_profil) REFERENCES Profil (id_profil)
    );

-- TABLE DE REFERENCE DES STATUTS (NOUVEAU)
CREATE TABLE
    Statut (
        id_statut SERIAL PRIMARY KEY,
        nom VARCHAR(20) NOT NULL UNIQUE -- Ex : 'actif', 'inactif', 'suspendu'
    );

-- HISTORIQUE DU STATUT DE L'ADHERENT (MODIFIÉ)
CREATE TABLE
    Statut_Adherent (
        id_statut_adherent SERIAL PRIMARY KEY,
        id_adherent INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif TIMESTAMP NOT NULL,
        CONSTRAINT fk_sa_adherent FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        CONSTRAINT fk_sa_statut FOREIGN KEY (id_statut) REFERENCES Statut (id_statut)
    );

-- ABONNEMENTS
CREATE TABLE
    Abonnement (
        id_abonnement SERIAL PRIMARY KEY,
        mois INT NOT NULL,
        annee INT NOT NULL,
        tarif NUMERIC(10, 2) NOT NULL
    );

CREATE TABLE
    Adherent_Abonnement (
        id_adherent INT NOT NULL,
        id_abonnement INT NOT NULL,
        date_de_paiement TIMESTAMP NOT NULL,
        PRIMARY KEY (id_adherent, id_abonnement),
        CONSTRAINT fk_aa_adherent FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        CONSTRAINT fk_aa_abonnement FOREIGN KEY (id_abonnement) REFERENCES Abonnement (id_abonnement)
    );

-- JOURS FERIES
CREATE TABLE
    Jour_Ferie (
        id_jour_ferie SERIAL PRIMARY KEY,
        description VARCHAR(100),
        date_jf DATE NOT NULL UNIQUE
    );

-- PRET, RENDU
CREATE TABLE
    Pret (
        id_pret SERIAL PRIMARY KEY,
        date_debut TIMESTAMP NOT NULL,
        date_fin TIMESTAMP NOT NULL,
        id_exemplaire INT NOT NULL,
        id_adherent INT NOT NULL,
        id_type_pret INT NOT NULL,
        CONSTRAINT fk_pret_exemplaire FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        CONSTRAINT fk_pret_adherent FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        CONSTRAINT fk_pret_typepret FOREIGN KEY (id_type_pret) REFERENCES TypePret (id_type_pret)
    );

CREATE TABLE
    Rendu (
        id_rendu SERIAL PRIMARY KEY,
        date_rendu TIMESTAMP NOT NULL,
        id_pret INT NOT NULL UNIQUE,
        CONSTRAINT fk_rendu_pret FOREIGN KEY (id_pret) REFERENCES Pret (id_pret)
    );

-- STATUTS GLOBAUX (pour reservations, prolongements, etc.)
CREATE TABLE
    Statut_Global (
        id_statut SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

-- RESERVATION
CREATE TABLE
    Reservation (
        id_reservation SERIAL PRIMARY KEY,
        id_exemplaire INT NOT NULL,
        id_adherent INT NOT NULL,
        date_reservation TIMESTAMP NOT NULL,
        date_debut TIMESTAMP,
        date_fin TIMESTAMP,
        CONSTRAINT fk_res_exemplaire FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        CONSTRAINT fk_res_adherent FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent)
    );

CREATE TABLE
    Historique_Statut_Reservation (
        id_historique SERIAL PRIMARY KEY,
        id_reservation INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif TIMESTAMP NOT NULL,
        id_utilisateur INT NOT NULL,
        commentaire VARCHAR(255),
        CONSTRAINT fk_hsr_reservation FOREIGN KEY (id_reservation) REFERENCES Reservation (id_reservation),
        CONSTRAINT fk_hsr_statut FOREIGN KEY (id_statut) REFERENCES Statut_Global (id_statut),
        CONSTRAINT fk_hsr_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur)
    );

-- PROLONGEMENT
CREATE TABLE
    Prolongement (
        id_prolongement SERIAL PRIMARY KEY,
        id_pret INT NOT NULL,
        nouvelle_date_fin TIMESTAMP NOT NULL,
        date_prolongement TIMESTAMP NOT NULL,
        CONSTRAINT fk_prol_pret FOREIGN KEY (id_pret) REFERENCES Pret (id_pret)
    );

CREATE TABLE
    Historique_Statut_Prolongement (
        id_historique SERIAL PRIMARY KEY,
        id_prolongement INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif TIMESTAMP NOT NULL,
        id_utilisateur INT NOT NULL,
        commentaire VARCHAR(255),
        CONSTRAINT fk_hsp_prolongement FOREIGN KEY (id_prolongement) REFERENCES Prolongement (id_prolongement),
        CONSTRAINT fk_hsp_statut FOREIGN KEY (id_statut) REFERENCES Statut_Global (id_statut),
        CONSTRAINT fk_hsp_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur)
    );

-- SANCTION
CREATE TABLE
    Sanction (
        id_sanction SERIAL PRIMARY KEY,
        id_adherent INT NOT NULL,
        motif VARCHAR(100),
        date_debut TIMESTAMP NOT NULL,
        date_fin TIMESTAMP NOT NULL,
        date_sanction TIMESTAMP NOT NULL,
        CONSTRAINT fk_sanction_adherent FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent)
    );