🍽️ HomeTaste - Backend

📖 Description

Ce dépôt représente la partie backend du projet HomeTaste, une plateforme dédiée aux petits commerçants souhaitant vendre leurs produits faits maison (vêtements, nourriture, accessoires, etc.).

Le backend est développé avec Spring Boot v3.4.4 et gère toutes les fonctionnalités serveur : API REST, authentification et autorisation via Spring Security, envoi d’e-mails via SMTP, et la gestion des données des utilisateurs, produits et commandes.

⚙️ Technologies utilisées

Spring Boot v3.4.4 – Framework principal du backend.

Spring Security – Gestion de l’authentification et de l’autorisation (JWT).

Spring Data JPA – Accès et gestion des données avec Hibernate.

Spring Mail (SMTP) – Envoi d’e-mails automatiques (inscription, notifications, etc.).

MongoDB – Base de données principale.

Maven – Outil de build et de gestion des dépendances.

Java 17 – Version du JDK utilisée pour le développement.

🧩 Fonctionnalités principales

🔐 Authentification sécurisée (login, JWT, rôles Admin/Vendeur/Client)

👥 Gestion des utilisateurs

🛍️ Gestion des produits : CRUD complet

📦 Gestion des commandes et paiements

📧 Envoi d’e-mails via SMTP (confirmation, réinitialisation du mot de passe, etc.)

📊 Endpoints statistiques pour le tableau de bord du backoffice
