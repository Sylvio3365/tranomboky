-- 1. LIVRES & EXEMPLAIRES
CREATE TABLE Livre (
    idLivre SERIAL PRIMARY KEY,
    titre VARCHAR(100) NOT NULL,
    auteur VARCHAR(100),
    dateDelete TIMESTAMP
);

CREATE TABLE Exemplaire (
    idExemplaire SERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE,
    idLivre INT NOT NULL REFERENCES Livre (idLivre),
    dateDelete TIMESTAMP
);

-- 2. RESTRICTION D'ÂGE
CREATE TABLE Restriction (
    idRestriction SERIAL PRIMARY KEY,
    ageMin INT NOT NULL,
    dateDelete TIMESTAMP
);

CREATE TABLE LivreRestriction (
    idLivre INT NOT NULL,
    idRestriction INT NOT NULL,
    PRIMARY KEY (idLivre, idRestriction),
    FOREIGN KEY (idLivre) REFERENCES Livre (idLivre),
    FOREIGN KEY (idRestriction) REFERENCES Restriction (idRestriction)
);

-- 3. REGLES DE PRET
CREATE TABLE Regle (
    idRegle SERIAL PRIMARY KEY,
    description VARCHAR(100),
    nbJourDureePretMax INT NOT NULL,
    nbLivrePreterMax INT NOT NULL,
    nbProlongementPretMax INT NOT NULL,
    nbJourProlongementMax INT NOT NULL,
    dateDelete TIMESTAMP
);

-- 4. TYPES DE PRET
CREATE TABLE TypePret (
    idTypePret SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL UNIQUE,
    dateDelete TIMESTAMP
);

CREATE TABLE ExemplaireTypePret (
    idExemplaire INT NOT NULL,
    idTypePret INT NOT NULL,
    PRIMARY KEY (idExemplaire, idTypePret),
    FOREIGN KEY (idExemplaire) REFERENCES Exemplaire (idExemplaire),
    FOREIGN KEY (idTypePret) REFERENCES TypePret (idTypePret)
);

-- 5. ETAT DES EXEMPLAIRES
CREATE TABLE Etat (
    idEtat SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL UNIQUE,
    dateDelete TIMESTAMP
);

CREATE TABLE HistoriqueEtatExemplaire (
    idHistorique SERIAL PRIMARY KEY,
    dateModif TIMESTAMP NOT NULL,
    idEtat INT NOT NULL REFERENCES Etat (idEtat),
    idExemplaire INT NOT NULL REFERENCES Exemplaire (idExemplaire)
);

-- 6. PROFILS, REGLES & PENALITES
CREATE TABLE Profil (
    idProfil SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL UNIQUE,
    dateDelete TIMESTAMP
);

CREATE TABLE ProfilRegle (
    idProfil INT NOT NULL,
    idRegle INT NOT NULL,
    PRIMARY KEY (idProfil, idRegle),
    FOREIGN KEY (idProfil) REFERENCES Profil (idProfil),
    FOREIGN KEY (idRegle) REFERENCES Regle (idRegle)
);

CREATE TABLE Penalite (
    idPenalite SERIAL PRIMARY KEY,
    nbJourDePenalite INT NOT NULL,
    motif VARCHAR(100),
    dateDelete TIMESTAMP
);

CREATE TABLE ProfilPenalite (
    idProfilPenalite SERIAL PRIMARY KEY,
    dateModif TIMESTAMP NOT NULL,
    idPenalite INT NOT NULL REFERENCES Penalite (idPenalite),
    idProfil INT NOT NULL REFERENCES Profil (idProfil)
);

-- 7. ROLES & UTILISATEURS
CREATE TABLE Role (
    idRole SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL UNIQUE,
    dateDelete TIMESTAMP
);

CREATE TABLE Utilisateur (
    idUtilisateur SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    mdp VARCHAR(50) NOT NULL,
    idRole INT NOT NULL REFERENCES Role (idRole),
    dateDelete TIMESTAMP
);

-- 8. ADHERENTS & ABONNEMENTS
CREATE TABLE Adherent (
    idAdherent SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    dateDeNaissance DATE NOT NULL,
    idProfil INT NOT NULL REFERENCES Profil (idProfil),
    idUtilisateur INT REFERENCES Utilisateur (idUtilisateur),
    dateDelete TIMESTAMP
);

CREATE TABLE Abonnement (
    idAbonnement SERIAL PRIMARY KEY,
    mois INT NOT NULL,
    annee INT NOT NULL,
    tarif NUMERIC(10,2) NOT NULL
);

CREATE TABLE AdherentAbonnement (
    idAdherent INT NOT NULL,
    idAbonnement INT NOT NULL,
    dateDePaiement TIMESTAMP NOT NULL,
    PRIMARY KEY (idAdherent, idAbonnement),
    FOREIGN KEY (idAdherent) REFERENCES Adherent (idAdherent),
    FOREIGN KEY (idAbonnement) REFERENCES Abonnement (idAbonnement)
);

-- 9. STATUTS
CREATE TABLE Statut (
    idStatut SERIAL PRIMARY KEY,
    nom VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE StatutAdherent (
    idStatutAdherent SERIAL PRIMARY KEY,
    dateModif TIMESTAMP NOT NULL,
    idStatut INT NOT NULL REFERENCES Statut (idStatut),
    idAdherent INT NOT NULL REFERENCES Adherent (idAdherent)
);

-- 10. JOURS FÉRIÉS
CREATE TABLE JourFerie (
    idJourFerie SERIAL PRIMARY KEY,
    description VARCHAR(100),
    dateJf DATE NOT NULL UNIQUE
);

-- 11. PRET & RENDU
CREATE TABLE Pret (
    idPret SERIAL PRIMARY KEY,
    dateDebut TIMESTAMP NOT NULL,
    dateFin TIMESTAMP NOT NULL,
    idTypePret INT NOT NULL REFERENCES TypePret (idTypePret),
    idAdherent INT NOT NULL REFERENCES Adherent (idAdherent),
    idExemplaire INT NOT NULL REFERENCES Exemplaire (idExemplaire)
);

CREATE TABLE Rendu (
    idRendu SERIAL PRIMARY KEY,
    dateRendu TIMESTAMP NOT NULL,
    idPret INT NOT NULL UNIQUE REFERENCES Pret (idPret)
);

-- 12. STATUTS GLOBAUX & HISTORIQUES
CREATE TABLE StatutGlobal (
    idStatut SERIAL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Reservation (
    idReservation SERIAL PRIMARY KEY,
    dateReservation TIMESTAMP NOT NULL,
    dateDebut TIMESTAMP,
    dateFin TIMESTAMP,
    idAdherent INT NOT NULL REFERENCES Adherent (idAdherent),
    idExemplaire INT NOT NULL REFERENCES Exemplaire (idExemplaire)
);

CREATE TABLE HistoriqueStatutReservation (
    idHistorique SERIAL PRIMARY KEY,
    dateModif TIMESTAMP NOT NULL,
    commentaire VARCHAR(255),
    idUtilisateur INT NOT NULL REFERENCES Utilisateur (idUtilisateur),
    idStatut INT NOT NULL REFERENCES StatutGlobal (idStatut),
    idReservation INT NOT NULL REFERENCES Reservation (idReservation)
);

-- 13. PROLONGEMENTS & HISTORIQUES
CREATE TABLE Prolongement (
    idProlongement SERIAL PRIMARY KEY,
    nouvelleDateFin TIMESTAMP NOT NULL,
    dateProlongement TIMESTAMP NOT NULL,
    idPret INT NOT NULL REFERENCES Pret (idPret)
);

CREATE TABLE HistoriqueStatutProlongement (
    idHistorique SERIAL PRIMARY KEY,
    dateModif TIMESTAMP NOT NULL,
    commentaire VARCHAR(255),
    idUtilisateur INT NOT NULL REFERENCES Utilisateur (idUtilisateur),
    idStatut INT NOT NULL REFERENCES StatutGlobal (idStatut),
    idProlongement INT NOT NULL REFERENCES Prolongement (idProlongement)
);

-- 14. SANCTION
CREATE TABLE Sanction (
    idSanction SERIAL PRIMARY KEY,
    motif VARCHAR(100),
    dateDebut TIMESTAMP NOT NULL,
    dateFin TIMESTAMP NOT NULL,
    dateSanction TIMESTAMP NOT NULL,
    idAdherent INT NOT NULL REFERENCES Adherent (idAdherent)
);

-- 15. REGLE JF
CREATE TABLE RegleJf (
    idRegleJf SERIAL PRIMARY KEY,
    comportement INT NOT NULL,
    dateModif TIMESTAMP NOT NULL
);

-- -- FIN DE LA PARTIE STRUCTURE --
