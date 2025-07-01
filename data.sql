-- ------------------------------
-- INSERTIONS DE DONNÉES D'EXEMPLE
-- ------------------------------

-- LIVRES & EXEMPLAIRES
INSERT INTO Livre (titre, auteur) VALUES
    ('Le Petit Prince', 'Antoine de Saint-Exupéry'),
    ('1984', 'George Orwell'),
    ('L''Étranger', 'Albert Camus');

INSERT INTO Exemplaire (code, idLivre) VALUES
    ('EX001', 1),
    ('EX002', 1),
    ('EX003', 2),
    ('EX004', 3);

-- RESTRICTION D'ÂGE
INSERT INTO Restriction (ageMin) VALUES
    (0),
    (12),
    (18);

INSERT INTO LivreRestriction (idLivre, idRestriction) VALUES
    (1, 1),
    (2, 3),
    (3, 2);

-- REGLES DE PRET
INSERT INTO Regle (description, nbJourDureePretMax, nbLivrePreterMax, nbProlongementPretMax, nbJourProlongementMax) VALUES
    ('Règle pour étudiant', 15, 3, 1, 7),
    ('Règle pour professeur', 30, 5, 2, 14);

-- TYPES DE PRET
INSERT INTO TypePret (nom) VALUES
    ('Consultation à la maison'),
    ('Consultation sur place');

INSERT INTO ExemplaireTypePret (idExemplaire, idTypePret) VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 2);

-- ETAT DES EXEMPLAIRES
INSERT INTO Etat (nom) VALUES
    ('Disponible'),
    ('En prêt'),
    ('Perdu');

INSERT INTO HistoriqueEtatExemplaire (idExemplaire, idEtat, dateModif) VALUES
    (1, 1, NOW()),
    (2, 2, NOW()),
    (3, 1, NOW()),
    (4, 3, NOW());

-- PROFILS & RÈGLES ASSOCIEES
INSERT INTO Profil (nom) VALUES
    ('Etudiant'),
    ('Professeur');

INSERT INTO ProfilRegle (idProfil, idRegle) VALUES
    (1, 1),
    (2, 2);

-- PENALITES
INSERT INTO Penalite (nbJourDePenalite, motif) VALUES
    (7, 'Retard'),
    (30, 'Livre perdu');

INSERT INTO ProfilPenalite (idProfil, idPenalite, dateModif) VALUES
    (1, 1, NOW()),
    (2, 2, NOW());

-- ROLES & UTILISATEURS
INSERT INTO Role (nom) VALUES
    ('admin'),
    ('bibliothecaire'),
    ('adherent');

INSERT INTO Utilisateur (username, mdp, idRole) VALUES
    ('admin1', 'passadmin', 1),
    ('biblio1', 'passbiblio', 2),
    ('user1', 'passuser', 3);

-- ADHERENTS
INSERT INTO Adherent (nom, prenom, dateDeNaissance, idUtilisateur, idProfil) VALUES
    ('Martin', 'Jean', '2010-05-10', 3, 1),
    ('Dupont', 'Alice', '1980-10-25', NULL, 2);

-- STATUTS D'ADHERENT
INSERT INTO Statut (nom) VALUES
    ('actif'),
    ('inactif');

INSERT INTO StatutAdherent (idAdherent, idStatut, dateModif) VALUES
    (1, 1, NOW()),
    (2, 1, NOW());

-- ABONNEMENTS
INSERT INTO Abonnement (mois, annee, tarif) VALUES
    (1, 2024, 5000.00),
    (2, 2024, 5000.00);

INSERT INTO AdherentAbonnement (idAdherent, idAbonnement, dateDePaiement) VALUES
    (1, 1, NOW()),
    (2, 2, NOW());

-- JOURS FÉRIÉS
INSERT INTO JourFerie (description, dateJf) VALUES
    ('Nouvel An', '2024-01-01'),
    ('Fête du Travail', '2024-05-01');

-- PRET & RENDU
INSERT INTO Pret (dateDebut, dateFin, idExemplaire, idAdherent, idTypePret) VALUES
    (NOW() - INTERVAL '10 days', NOW() + INTERVAL '5 days', 1, 1, 1),
    (NOW() - INTERVAL '20 days', NOW() - INTERVAL '1 day', 3, 2, 1);

INSERT INTO Rendu (dateRendu, idPret) VALUES
    (NOW(), 2);

-- STATUTS GLOBAUX
INSERT INTO StatutGlobal (nom) VALUES
    ('en cours'),
    ('termine'),
    ('annule');

-- RESERVATION & HISTORIQUE RESERVATION
INSERT INTO Reservation (idExemplaire, idAdherent, dateReservation, dateDebut, dateFin) VALUES
    (2, 1, NOW() - INTERVAL '3 days', NOW(), NOW() + INTERVAL '5 days');

INSERT INTO HistoriqueStatutReservation (idReservation, idStatut, dateModif, idUtilisateur, commentaire) VALUES
    (1, 1, NOW(), 3, 'Première réservation');

-- PROLONGEMENT & HISTORIQUE PROLONGEMENT
INSERT INTO Prolongement (idPret, nouvelleDateFin, dateProlongement) VALUES
    (1, NOW() + INTERVAL '10 days', NOW());

INSERT INTO HistoriqueStatutProlongement (idProlongement, idStatut, dateModif, idUtilisateur, commentaire) VALUES
    (1, 1, NOW(), 3, 'Prolongement accordé');

-- SANCTION
INSERT INTO Sanction (idAdherent, motif, dateDebut, dateFin, dateSanction) VALUES
    (1, 'Retard', NOW() - INTERVAL '3 days', NOW() + INTERVAL '4 days', NOW());

-- REGLE JF (vide ici, exemple à compléter selon besoin)
