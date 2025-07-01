CREATE TABLE
    Livre (
        id_livre SERIAL PRIMARY KEY,
        titre VARCHAR(100) NOT NULL,
        auteur VARCHAR(100)
    );

CREATE TABLE
    Exemplaire (
        id_exemplaire SERIAL PRIMARY KEY,
        code VARCHAR(50) NOT NULL UNIQUE,
        id_livre INT NOT NULL REFERENCES Livre (id_livre)
    );

CREATE TABLE
    Etat (
        id_etat SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Restriction (
        id_restriction SERIAL PRIMARY KEY,
        age_min INT NOT NULL
    );

CREATE TABLE
    Regle (
        id_regle SERIAL PRIMARY KEY,
        description VARCHAR(100),
        nb_jour_duree_pret_max INT NOT NULL,
        nb_livre_preter_max INT NOT NULL,
        nb_prolongement_pret_max INT NOT NULL,
        nb_jour_prolongement_max INT NOT NULL
    );

CREATE TABLE
    Profil (
        id_profil SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Penalite (
        id_penalite SERIAL PRIMARY KEY,
        nb_jour_de_penalite INT NOT NULL,
        motif VARCHAR(100)
    );

CREATE TABLE
    TypePret (
        id_type_pret SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

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
        id_role INT NOT NULL REFERENCES Role (id_role)
    );

CREATE TABLE
    Adherent (
        id_adherent SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL,
        prenom VARCHAR(50) NOT NULL,
        date_de_naissance DATE NOT NULL,
        id_profil INT NOT NULL REFERENCES Profil (id_profil),
        id_utilisateur INT REFERENCES Utilisateur (id_utilisateur)
    );

CREATE TABLE
    Statut (
        id_statut SERIAL PRIMARY KEY,
        nom VARCHAR(20) NOT NULL UNIQUE
    );

CREATE TABLE
    Abonnement (
        id_abonnement SERIAL PRIMARY KEY,
        mois INT NOT NULL,
        annee INT NOT NULL,
        tarif NUMERIC(10, 2) NOT NULL
    );

CREATE TABLE
    Jour_Ferie (
        id_jour_ferie SERIAL PRIMARY KEY,
        description VARCHAR(100),
        date_jf DATE NOT NULL UNIQUE
    );

CREATE TABLE
    Statut_Global (
        id_statut SERIAL PRIMARY KEY,
        nom VARCHAR(50) NOT NULL UNIQUE
    );

CREATE TABLE
    Reservation (
        id_reservation SERIAL PRIMARY KEY,
        date_reservation TIMESTAMP NOT NULL,
        date_debut TIMESTAMP,
        date_fin TIMESTAMP,
        id_adherent INT NOT NULL REFERENCES Adherent (id_adherent),
        id_exemplaire INT NOT NULL REFERENCES Exemplaire (id_exemplaire)
    );

CREATE TABLE
    Sanction (
        id_sanction SERIAL PRIMARY KEY,
        motif VARCHAR(100),
        date_debut TIMESTAMP NOT NULL,
        date_fin TIMESTAMP NOT NULL,
        date_sanction TIMESTAMP NOT NULL,
        id_adherent INT NOT NULL REFERENCES Adherent (id_adherent)
    );

CREATE TABLE
    Regle_JF (
        id_regle_jf SERIAL PRIMARY KEY,
        comportement INT NOT NULL,
        date_modif TIMESTAMP NOT NULL
    );

CREATE TABLE
    Historique_Etat_Exemplaire (
        id_historique SERIAL PRIMARY KEY,
        date_modif TIMESTAMP NOT NULL,
        id_etat INT NOT NULL REFERENCES Etat (id_etat),
        id_exemplaire INT NOT NULL REFERENCES Exemplaire (id_exemplaire)
    );

CREATE TABLE
    Profil_Penalite (
        id_profil_penalite SERIAL PRIMARY KEY,
        date_modif TIMESTAMP NOT NULL,
        id_penalite INT NOT NULL REFERENCES Penalite (id_penalite),
        id_profil INT NOT NULL REFERENCES Profil (id_profil)
    );

CREATE TABLE
    Pret (
        id_pret SERIAL PRIMARY KEY,
        date_debut TIMESTAMP NOT NULL,
        date_fin TIMESTAMP NOT NULL,
        id_type_pret INT NOT NULL REFERENCES TypePret (id_type_pret),
        id_adherent INT NOT NULL REFERENCES Adherent (id_adherent),
        id_exemplaire INT NOT NULL REFERENCES Exemplaire (id_exemplaire)
    );

CREATE TABLE
    Rendu (
        id_rendu SERIAL PRIMARY KEY,
        date_rendu TIMESTAMP NOT NULL,
        id_pret INT NOT NULL UNIQUE REFERENCES Pret (id_pret)
    );

CREATE TABLE
    Statut_Adherent (
        id_statut_adherent SERIAL PRIMARY KEY,
        date_modif TIMESTAMP NOT NULL,
        id_statut INT NOT NULL REFERENCES Statut (id_statut),
        id_adherent INT NOT NULL REFERENCES Adherent (id_adherent)
    );

CREATE TABLE
    Historique_Statut_Reservation (
        id_historique SERIAL PRIMARY KEY,
        date_modif TIMESTAMP NOT NULL,
        commentaire VARCHAR(255),
        id_utilisateur INT NOT NULL REFERENCES Utilisateur (id_utilisateur),
        id_statut INT NOT NULL REFERENCES Statut_Global (id_statut),
        id_reservation INT NOT NULL REFERENCES Reservation (id_reservation)
    );

CREATE TABLE
    Prolongement (
        id_prolongement SERIAL PRIMARY KEY,
        nouvelle_date_fin TIMESTAMP NOT NULL,
        date_prolongement TIMESTAMP NOT NULL,
        id_pret INT NOT NULL REFERENCES Pret (id_pret)
    );

CREATE TABLE
    Historique_Statut_Prolongement (
        id_historique SERIAL PRIMARY KEY,
        date_modif TIMESTAMP NOT NULL,
        commentaire VARCHAR(255),
        id_utilisateur INT NOT NULL REFERENCES Utilisateur (id_utilisateur),
        id_statut INT NOT NULL REFERENCES Statut_Global (id_statut),
        id_prolongement INT NOT NULL REFERENCES Prolongement (id_prolongement)
    );

CREATE TABLE
    Livre_Restriction (
        id_livre INT NOT NULL,
        id_restriction INT NOT NULL,
        PRIMARY KEY (id_livre, id_restriction),
        FOREIGN KEY (id_livre) REFERENCES Livre (id_livre),
        FOREIGN KEY (id_restriction) REFERENCES Restriction (id_restriction)
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
    Adherent_Abonnement (
        id_adherent INT NOT NULL,
        id_abonnement INT NOT NULL,
        date_de_paiement TIMESTAMP NOT NULL,
        PRIMARY KEY (id_adherent, id_abonnement),
        FOREIGN KEY (id_adherent) REFERENCES Adherent (id_adherent),
        FOREIGN KEY (id_abonnement) REFERENCES Abonnement (id_abonnement)
    );

CREATE TABLE
    Exemplaire_TypePret (
        id_exemplaire INT NOT NULL,
        id_type_pret INT NOT NULL,
        PRIMARY KEY (id_exemplaire, id_type_pret),
        FOREIGN KEY (id_exemplaire) REFERENCES Exemplaire (id_exemplaire),
        FOREIGN KEY (id_type_pret) REFERENCES TypePret (id_type_pret)
    );