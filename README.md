📂 Getting into Practice: Input/Output – Java Project
📋 Présentation du projet

Ce projet illustre l’utilisation des entrées/sorties en Java (I/O) et de la sérialisation d’objets à travers deux exercices pratiques.
Il couvre la manipulation des fichiers, la lecture de répertoires, l’affichage d’informations système, ainsi que la persistance d’objets Java dans un fichier binaire (products.dat).

Auteur : Aya Agrigah
GitHub : tp3_aya
Cours : Programmation Orientée Objet en Java
Année académique : 2025/2026
Encadrante : Loubna Aminou

📦 Partie I : Simulation de la commande ls
1️⃣ Exercice 1 – Listing de fichiers et répertoires

L’objectif est de développer un programme Java qui simule la commande ls du système.

🎯 Fonctionnalités

L’utilisateur saisit le chemin complet d’un répertoire.

Le programme affiche :

Le chemin de chaque fichier et dossier

Le type :

<DIR> pour les dossiers

<FILE> pour les fichiers

Les permissions :

r : lisible

w : modifiable

h : fichier caché

🧾 Exemple d’affichage

<img width="1443" height="220" alt="image" src="https://github.com/user-attachments/assets/79031cd5-41cc-472d-8f7c-59c9967c0707" />

📌 Concepts utilisés

Classe File

Lecture de répertoires

Tests de permissions (read, write, hidden)

Manipulation de chaînes de caractères

📦 Partie II : Sérialisation d’objets (products.dat)
2️⃣ Exercice 2 – Gestion et persistance des produits

L’objectif est de sauvegarder et relire une collection d’objets Product dans un fichier binaire à l’aide de la sérialisation.

📄 Classes principales
🔹 Product.java

Modèle représentant un produit avec les attributs :

id

name

brand

price

description

numberInStock

➡️ Implémente l’interface Serializable.

🔹 IProduitMetier.java

Interface déclarant les opérations CRUD :

add() : Ajouter un produit

getAll() : Charger tous les produits depuis le fichier

findById(long id) : Rechercher un produit par ID

delete(long id) : Supprimer un produit par ID

saveAll() : Sauvegarder tous les produits dans products.dat

🔹 MetierProduitImpl.java

Implémentation de IProduitMetier :

Contient une liste de produits

Contient le nom du fichier (products.dat)

Implémente toutes les méthodes CRUD

Gère la sérialisation et la désérialisation

🔹 Application.java

Application console contenant le main() avec un menu interactif :

1. Display the list of products

<img width="1017" height="265" alt="image" src="https://github.com/user-attachments/assets/a4fbce8f-8b30-4ceb-8823-82258571f613" />

2. Search for a product by its ID
   
<img width="996" height="238" alt="image" src="https://github.com/user-attachments/assets/6bd63e29-c50a-47f6-a61e-4615d70bfbc3" />

3. Add a new product to the list
   
<img width="563" height="345" alt="image" src="https://github.com/user-attachments/assets/b6b6248c-a3f4-4030-a698-5572cd897d24" />

4. Delete a product by ID
   
<img width="404" height="224" alt="image" src="https://github.com/user-attachments/assets/8589db1a-2f99-4896-a67b-8ff01126573b" />

<img width="1005" height="450" alt="image" src="https://github.com/user-attachments/assets/c9886046-aa7a-4343-bf06-7af1290b61d6" />

5. Save the products
   
<img width="482" height="540" alt="image" src="https://github.com/user-attachments/assets/44e9307d-ad21-4f0a-b176-988ed71b1464" />

6. Exit
    
<img width="408" height="217" alt="image" src="https://github.com/user-attachments/assets/4769cc45-22f2-47a2-9128-eaab22b8ed3e" />


🎯 Compétences acquises
✅ Entrées / Sorties (I/O)

Lecture de fichiers et répertoires

Manipulation de chemins système

Gestion des permissions

✅ Sérialisation

Sauvegarde d’objets dans un fichier

Lecture d’objets sérialisés

Persistance des données

✅ POO en Java

Encapsulation

Interfaces

Implémentation de services métier

Applications console interactives

🚀 Exécution du projet

Chaque exercice contient une classe avec une méthode main().

Dans IntelliJ IDEA :

Clic droit sur la classe Java

Sélectionner Run [ClassName].main()

Suivre les instructions affichées dans la console
