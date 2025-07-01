-- TYPES DE STATUT D'ADHERENT
INSERT INTO
    Type_Statut_Adherent (nom)
VALUES
    ('actif'),
    ('inactif');

-- LIVRES ET EXEMPLAIRES
INSERT INTO
    Livre (titre, auteur)
VALUES
    ('Le Petit Prince', 'Antoine de Saint-Exupéry'),
    ('1984', 'George Orwell'),
    ('Les Misérables', 'Victor Hugo');

INSERT INTO
    Exemplaire (code, id_livre)
VALUES
    ('EX-0001', 1),
    ('EX-0002', 1),
    ('EX-0003', 2),
    ('EX-0004', 3);

-- RESTRICTIONS
INSERT INTO
    Restriction (age_min)
VALUES
    (0),
    (12),
    (16);

INSERT INTO
    Livre_Restriction (id_livre, id_restriction)
VALUES
    (1, 1),
    (2, 2),
    (3, 3);

-- REGLES
INSERT INTO
    Regle (
        description,
        nb_jour_duree_pret_max,
        nb_livre_preter_max,
        nb_prolongement_pret_max,
        nb_jour_prolongement_max
    )
VALUES
    ('Règle étudiant', 30, 3, 2, 15),
    ('Règle professeur', 60, 8, 3, 30);

INSERT INTO
    Livre_Regle (id_livre, id_regle)
VALUES
    (1, 1),
    (2, 1),
    (3, 2);

-- TYPE DE PRET
INSERT INTO
    TypePret (nom)
VALUES
    ('Maison'),
    ('Sur place');

INSERT INTO
    Exemplaire_TypePret (id_exemplaire, id_type_pret)
VALUES
    (1, 1),
    (2, 1),
    (2, 2),
    (3, 2),
    (4, 1);

-- ETAT D'UN EXEMPLAIRE
INSERT INTO
    Etat (nom)
VALUES
    ('disponible'),
    ('emprunté'),
    ('réservé');

-- PROFILS
INSERT INTO
    Profil (nom)
VALUES
    ('Etudiant'),
    ('Professeur');

INSERT INTO
    Profil_Regle (id_profil, id_regle)
VALUES
    (1, 1),
    (2, 2);

-- PENALITES
INSERT INTO
    Penalite (nb_jour_de_penalite, motif)
VALUES
    (3, 'Retard'),
    (7, 'Non-retour');

INSERT INTO
    Profil_Penalite (id_profil, id_penalite, date_modif)
VALUES
    (1, 1, NOW ()),
    (2, 2, NOW ());

-- ROLES & UTILISATEURS
INSERT INTO
    Role (nom)
VALUES
    ('bibliothecaire'),
    ('adherent'),
    ('admin');

INSERT INTO
    Utilisateur (username, mdp, id_role)
VALUES
    ('biblio', 'mdpbiblio', 1),
    ('user1', 'mdpuser1', 2),
    ('admin', 'mdpadmin', 3);

-- ADHERENTS
INSERT INTO
    Adherent (
        nom,
        prenom,
        date_de_naissance,
        id_utilisateur,
        id_profil
    )
VALUES
    ('Rakoto', 'Jean', '1990-05-15', 2, 1),
    ('Rabe', 'Marie', '1985-09-20', NULL, 2);

-- STATUT ADHERENT (actuel)
INSERT INTO
    Statut_Adherent (id_adherent, id_type_statut, date_modif)
VALUES
    (1, 1, NOW ()),
    (2, 2, NOW ());

-- ABONNEMENTS
INSERT INTO
    Abonnement (mois, annee, tarif)
VALUES
    (7, 2024, 12000),
    (8, 2024, 12000);

INSERT INTO
    Adherent_Abonnement (id_adherent, id_abonnement, date_de_paiement)
VALUES
    (1, 1, NOW ()),
    (2, 2, NOW ());

-- JOURS FERIES
INSERT INTO
    Jour_Ferie (description, date_jf)
VALUES
    ('Fête nationale', '2024-06-26'),
    ('Nouvel An', '2025-01-01');

-- PRET, RENDU
INSERT INTO
    Pret (
        date_debut,
        date_fin,
        id_exemplaire,
        id_adherent,
        id_type_pret
    )
VALUES
    ('2024-07-01', '2024-07-15', 1, 1, 1),
    ('2024-07-01', '2024-07-10', 2, 2, 2);

INSERT INTO
    Rendu (date_rendu, id_pret)
VALUES
    ('2024-07-15', 1);

-- STATUTS GLOBAUX
INSERT INTO
    Statut_Global (nom)
VALUES
    ('en attente'),
    ('confirmé'),
    ('annulé');

-- RESERVATION
INSERT INTO
    Reservation (
        id_exemplaire,
        id_adherent,
        date_reservation,
        date_debut,
        date_fin
    )
VALUES
    (3, 1, '2024-07-10', '2024-07-12', '2024-07-15'),
    (4, 2, '2024-07-11', NULL, NULL);