-- LIVRES ET EXEMPLAIRES
CREATE TABLE
    Livre (
        id_livre INT AUTO_INCREMENT PRIMARY KEY,
        titre VARCHAR(100) NOT NULL,
        auteur VARCHAR(100)
    );

CREATE TABLE
    Exemplaire (
        id_exemplaire INT AUTO_INCREMENT PRIMARY KEY,
        code VARCHAR(50) UNIQUE NOT NULL,
        id_livre INT NOT NULL,
        FOREIGN KEY (id_livre) REFERENCES Livre (id_livre)
    );

-- RESTRICTION D'ÂGE
CREATE TABLE
    Restriction (
        id_restriction INT AUTO_INCREMENT PRIMARY KEY,
        age_min INT NOT NULL
    );

CREATE TABLE
    Livre_Restriction (
        id_livre INT NOT NULL,
        id_restriction INT NOT NULL,
        PRIMARY KEY (id_livre, id_restriction),
        FOREIGN KEY (id_livre) REFERENCES Livre (id_livre),
        FOREIGN KEY (id_restriction) REFERENCES Restriction (id_restriction)
    );

-- REGLES
CREATE TABLE
    Regle (
        id_regle INT AUTO_INCREMENT PRIMARY KEY,
        description VARCHAR(100),
        nb_jour_duree_pret_max INT NOT NULL,
        nb_livre_preter_max INT NOT NULL,
        nb_prolongement_pret_max INT NOT NULL,
        nb_jour_prolongement_max INT NOT NULL
    );

CREATE TABLE
    Livre_Regle (
        id_livre INT NOT NULL,
        id_regle INT NOT NULL,
        PRIMARY KEY (id_livre, id_regle),
        FOREIGN KEY (id_livre) REFERENCES Livre (id_livre),
        FOREIGN KEY (id_regle) REFERENCES Regle (id_regle)
    );

-- TYPE DE PRET
CREATE TABLE
    TypePret (
        id_type_pret INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Exemplaire_TypePret (
        id_exemplaire INT NOT NULL,
        id_type_pret INT NOT NULL,
        PRIMARY KEY (id_exemplaire, id_type_pret),
        FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        FOREIGN KEY (id_type_pret) REFERENCES TypePret (id_type_pret)
    );

-- ETAT D'UN EXEMPLAIRE
CREATE TABLE
    Etat (
        id_etat INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Historique_Etat_Exemplaire (
        id_historique INT AUTO_INCREMENT PRIMARY KEY,
        id_exemplaire INT NOT NULL,
        id_etat INT NOT NULL,
        date_modif DATETIME NOT NULL,
        FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        FOREIGN KEY (id_etat) REFERENCES Etat (id_etat)
    );

-- PROFIL, REGLE, PENALITE
CREATE TABLE
    Profil (
        id_profil INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Profil_Regle (
        id_profil INT NOT NULL,
        id_regle INT NOT NULL,
        PRIMARY KEY (id_profil, id_regle),
        FOREIGN KEY (id_profil) REFERENCES Profil (id_profil),
        FOREIGN KEY (id_regle) REFERENCES Regle (id_regle)
    );

CREATE TABLE
    Penalite (
        id_penalite INT AUTO_INCREMENT PRIMARY KEY,
        nb_jour_de_penalite INT NOT NULL,
        motif VARCHAR(100)
    );

CREATE TABLE
    Profil_Penalite (
        id_profil_penalite INT AUTO_INCREMENT PRIMARY KEY,
        id_profil INT NOT NULL,
        id_penalite INT NOT NULL,
        date_modif DATETIME NOT NULL,
        FOREIGN KEY (id_profil) REFERENCES Profil (id_profil),
        FOREIGN KEY (id_penalite) REFERENCES Penalite (id_penalite)
    );

-- UTILISATEURS, ROLES, ADHERENTS
CREATE TABLE
    Role (
        id_role INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Utilisateur (
        id_utilisateur INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL UNIQUE,
        mdp VARCHAR(50) NOT NULL,
        id_role INT NOT NULL,
        FOREIGN KEY (id_role) REFERENCES Role (id_role)
    );

CREATE TABLE
    Adherent (
        id_adherent INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL,
        prenom VARCHAR(50) NOT NULL,
        date_de_naissance DATE NOT NULL,
        id_utilisateur INT,
        id_profil INT NOT NULL,
        FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur),
        FOREIGN KEY (id_profil) REFERENCES Profil (id_profil)
    );

-- STATUT DE L'ADHERENT (historique)
CREATE TABLE
    Statut_Adherent (
        id_statut_adherent INT AUTO_INCREMENT PRIMARY KEY,
        id_adherent INT NOT NULL,
        statut VARCHAR(20) NOT NULL, -- Ex : 'actif', 'inactif', 'suspendu'
        date_debut DATETIME NOT NULL,
        date_fin DATETIME, -- NULL si le statut est encore en cours
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent)
    );

-- ABONNEMENTS
CREATE TABLE
    Abonnement (
        id_abonnement INT AUTO_INCREMENT PRIMARY KEY,
        mois INT NOT NULL,
        annee INT NOT NULL,
        tarif DECIMAL(10, 2) NOT NULL
    );

CREATE TABLE
    Adherent_Abonnement (
        id_adherent INT NOT NULL,
        id_abonnement INT NOT NULL,
        date_de_paiement DATETIME NOT NULL,
        PRIMARY KEY (id_adherent, id_abonnement),
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        FOREIGN KEY (id_abonnement) REFERENCES Abonnement (id_abonnement)
    );

-- JOURS FERIES
CREATE TABLE
    Jour_Ferie (
        id_jour_ferie INT AUTO_INCREMENT PRIMARY KEY,
        description VARCHAR(100),
        date_jf DATE NOT NULL UNIQUE
    );

-- PRET, RENDU
CREATE TABLE
    Pret (
        id_pret INT AUTO_INCREMENT PRIMARY KEY,
        date_debut DATETIME NOT NULL,
        date_fin DATETIME NOT NULL,
        id_exemplaire INT NOT NULL,
        id_adherent INT NOT NULL,
        id_type_pret INT NOT NULL,
        FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        FOREIGN KEY (id_type_pret) REFERENCES TypePret (id_type_pret)
    );

CREATE TABLE
    Rendu (
        id_rendu INT AUTO_INCREMENT PRIMARY KEY,
        date_rendu DATETIME NOT NULL,
        id_pret INT NOT NULL UNIQUE,
        FOREIGN KEY (id_pret) REFERENCES Pret (id_pret)
    );

-- STATUTS GLOBAUX (pour reservations, prolongements, etc.)
CREATE TABLE
    Statut_Global (
        id_statut INT AUTO_INCREMENT PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

-- RESERVATION
CREATE TABLE
    Reservation (
        id_reservation INT AUTO_INCREMENT PRIMARY KEY,
        id_exemplaire INT NOT NULL,
        id_adherent INT NOT NULL,
        date_reservation DATETIME NOT NULL,
        date_debut DATETIME,
        date_fin DATETIME,
        FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent)
    );

CREATE TABLE
    Historique_Statut_Reservation (
        id_historique INT AUTO_INCREMENT PRIMARY KEY,
        id_reservation INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif DATETIME NOT NULL,
        id_utilisateur INT NOT NULL,
        commentaire VARCHAR(255),
        FOREIGN KEY (id_reservation) REFERENCES Reservation (id_reservation),
        FOREIGN KEY (id_statut) REFERENCES Statut_Global (id_statut),
        FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur)
    );

-- PROLONGEMENT
CREATE TABLE
    Prolongement (
        id_prolongement INT AUTO_INCREMENT PRIMARY KEY,
        id_pret INT NOT NULL,
        nouvelle_date_fin DATETIME NOT NULL,
        date_prolongement DATETIME NOT NULL,
        FOREIGN KEY (id_pret) REFERENCES Pret (id_pret)
    );

CREATE TABLE
    Historique_Statut_Prolongement (
        id_historique INT AUTO_INCREMENT PRIMARY KEY,
        id_prolongement INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif DATETIME NOT NULL,
        id_utilisateur INT NOT NULL,
        commentaire VARCHAR(255),
        FOREIGN KEY (id_prolongement) REFERENCES Prolongement (id_prolongement),
        FOREIGN KEY (id_statut) REFERENCES Statut_Global (id_statut),
        FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur)
    );

-- SANCTION
CREATE TABLE
    Sanction (
        id_sanction INT AUTO_INCREMENT PRIMARY KEY,
        id_adherent INT NOT NULL,
        motif VARCHAR(100),
        date_debut DATETIME NOT NULL,
        date_fin DATETIME NOT NULL,
        date_sanction DATETIME NOT NULL,
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent)
    );

CREATE TABLE
    Historique_Statut_Sanction (
        id_historique INT AUTO_INCREMENT PRIMARY KEY,
        id_sanction INT NOT NULL,
        id_statut INT NOT NULL,
        date_modif DATETIME NOT NULL,
        id_utilisateur INT NOT NULL,
        commentaire VARCHAR(255),
        FOREIGN KEY (id_sanction) REFERENCES Sanction (id_sanction),
        FOREIGN KEY (id_statut) REFERENCES Statut_Global (id_statut),
        FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur (id_utilisateur)
    );