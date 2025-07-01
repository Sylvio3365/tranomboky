-- 1. LIVRES & EXEMPLAIRES
INSERT INTO
    Livre (titre, auteur)
VALUES
    ('Le Petit Prince', 'Antoine de Saint-Exupéry'),
    ('1984', 'George Orwell'),
    ('L''Étranger', 'Albert Camus');

INSERT INTO
    Exemplaire (code, id_livre)
VALUES
    ('EX001', 1),
    ('EX002', 1),
    ('EX003', 2),
    ('EX004', 3);

-- 2. RESTRICTION D'ÂGE
INSERT INTO
    Restriction (age_min)
VALUES
    (0), -- Aucune restriction
    (12), -- À partir de 12 ans
    (18);

-- À partir de 18 ans
-- ATTENTION : Les clés étrangères doivent exister, donc les valeurs doivent référencer les bons IDs.
INSERT INTO
    Livre_Restriction (id_livre, id_restriction)
VALUES
    (1, 1), -- Le Petit Prince, aucune restriction
    (2, 3), -- 1984, restriction 18+
    (3, 2);

-- L'Étranger, restriction 12+
-- 3. RÈGLES DE PRÊT
INSERT INTO
    Regle (
        description,
        nb_jour_duree_pret_max,
        nb_livre_preter_max,
        nb_prolongement_pret_max,
        nb_jour_prolongement_max
    )
VALUES
    ('Règle pour étudiant', 15, 3, 1, 7),
    ('Règle pour professeur', 30, 5, 2, 14);

-- 4. TYPES DE PRÊT
INSERT INTO
    TypePret (nom)
VALUES
    ('Consultation à la maison'),
    ('Consultation sur place');

INSERT INTO
    Exemplaire_TypePret (id_exemplaire, id_type_pret)
VALUES
    (1, 1), -- EX001 prêt à la maison
    (2, 1), -- EX002 prêt à la maison
    (3, 1), -- EX003 prêt à la maison
    (4, 2);

-- EX004 consultation sur place
-- 5. ETATS DES EXEMPLAIRES
INSERT INTO
    Etat (nom)
VALUES
    ('Disponible'),
    ('En prêt'),
    ('Perdu');

INSERT INTO
    Historique_Etat_Exemplaire (id_exemplaire, id_etat, date_modif)
VALUES
    (1, 1, NOW ()), -- EX001 disponible
    (2, 2, NOW ()), -- EX002 en prêt
    (3, 1, NOW ()), -- EX003 disponible
    (4, 3, NOW ());

-- EX004 perdu
-- 6. PROFILS & RÈGLES ASSOCIEES
INSERT INTO
    Profil (nom)
VALUES
    ('Etudiant'),
    ('Professeur');

INSERT INTO
    Profil_Regle (id_profil, id_regle)
VALUES
    (1, 1), -- Etudiant - règle étudiant
    (2, 2);

-- Professeur - règle professeur
-- 7. PENALITES
INSERT INTO
    Penalite (nb_jour_de_penalite, motif)
VALUES
    (7, 'Retard'),
    (30, 'Livre perdu');

INSERT INTO
    Profil_Penalite (id_profil, id_penalite, date_modif)
VALUES
    (1, 1, NOW ()), -- Etudiant - Retard
    (2, 2, NOW ());

-- Professeur - Livre perdu
-- 8. ROLES & UTILISATEURS
INSERT INTO
    Role (nom)
VALUES
    ('admin'),
    ('bibliothécaire'),
    ('adherent');

INSERT INTO
    Utilisateur (username, mdp, id_role)
VALUES
    ('admin1', 'passadmin', 1),
    ('biblio1', 'passbiblio', 2),
    ('user1', 'passuser', 3);

-- 9. ADHERENTS
INSERT INTO
    Adherent (
        nom,
        prenom,
        date_de_naissance,
        id_utilisateur,
        id_profil
    )
VALUES
    ('Martin', 'Jean', '2010-05-10', 3, 1), -- lié à user1, profil étudiant
    ('Dupont', 'Alice', '1980-10-25', NULL, 2);

-- sans utilisateur, profil professeur
-- 10. STATUTS D'ADHERENT
INSERT INTO
    Statut (nom)
VALUES
    ('actif'),
    ('inactif');

INSERT INTO
    Statut_Adherent (id_adherent, id_statut, date_modif)
VALUES
    (1, 1, NOW ()), -- Jean Martin - actif
    (2, 1, NOW ());

-- Alice Dupont - actif
-- 11. ABONNEMENTS
INSERT INTO
    Abonnement (mois, annee, tarif)
VALUES
    (1, 2024, 5000.00),
    (2, 2024, 5000.00);

INSERT INTO
    Adherent_Abonnement (id_adherent, id_abonnement, date_de_paiement)
VALUES
    (1, 1, NOW ()), -- Jean Martin - janvier 2024
    (2, 2, NOW ());

-- Alice Dupont - février 2024
-- 12. JOURS FÉRIÉS
INSERT INTO
    Jour_Ferie (description, date_jf)
VALUES
    ('Nouvel An', '2024-01-01'),
    ('Fête du Travail', '2024-05-01');

-- 13. PRET & RENDU
INSERT INTO
    Pret (
        date_debut,
        date_fin,
        id_exemplaire,
        id_adherent,
        id_type_pret
    )
VALUES
    (
        NOW () - INTERVAL '10 days',
        NOW () + INTERVAL '5 days',
        1,
        1,
        1
    ), -- Jean Martin, EX001
    (
        NOW () - INTERVAL '20 days',
        NOW () - INTERVAL '1 day',
        3,
        2,
        1
    );

-- Alice Dupont, EX003
INSERT INTO
    Rendu (date_rendu, id_pret)
VALUES
    (NOW (), 2);

-- Alice Dupont a rendu
-- 14. STATUTS GLOBAUX
INSERT INTO
    Statut_Global (nom)
VALUES
    ('en cours'),
    ('terminé'),
    ('annulé');

-- 15. RESERVATION & HISTORIQUE RESERVATION
INSERT INTO
    Reservation (
        id_exemplaire,
        id_adherent,
        date_reservation,
        date_debut,
        date_fin
    )
VALUES
    (
        2,
        1,
        NOW () - INTERVAL '3 days',
        NOW (),
        NOW () + INTERVAL '5 days'
    );

-- Jean Martin réserve EX002
INSERT INTO
    Historique_Statut_Reservation (
        id_reservation,
        id_statut,
        date_modif,
        id_utilisateur,
        commentaire
    )
VALUES
    (1, 1, NOW (), 3, 'Première réservation');

-- statut en cours, par user1
-- 16. PROLONGEMENT & HISTORIQUE PROLONGEMENT
INSERT INTO
    Prolongement (id_pret, nouvelle_date_fin, date_prolongement)
VALUES
    (1, NOW () + INTERVAL '10 days', NOW ());

-- prolongement du prêt 1
INSERT INTO
    Historique_Statut_Prolongement (
        id_prolongement,
        id_statut,
        date_modif,
        id_utilisateur,
        commentaire
    )
VALUES
    (1, 1, NOW (), 3, 'Prolongement accordé');

-- par user1
-- 17. SANCTION
INSERT INTO
    Sanction (
        id_adherent,
        motif,
        date_debut,
        date_fin,
        date_sanction
    )
VALUES
    (
        1,
        'Retard',
        NOW () - INTERVAL '3 days',
        NOW () + INTERVAL '4 days',
        NOW ()
    );

-- sanction Jean Martin