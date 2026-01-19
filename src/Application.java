import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par ID");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par ID");
            System.out.println("5. Sauvegarder les produits");
            System.out.println("6. Quitter");

            System.out.print("Votre choix : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consommer le saut de ligne

            switch (choice) {
                case 1:
                    List<Product> products = metier.getAll();
                    products.forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("ID du produit : ");
                    long id = scanner.nextLong();
                    Product p = metier.findById(id);
                    System.out.println(p != null ? p : "Produit introuvable");
                    break;

                case 3:
                    System.out.print("ID : ");
                    long newId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nom : ");
                    String name = scanner.nextLine();

                    System.out.print("Marque : ");
                    String brand = scanner.nextLine();

                    System.out.print("Prix : ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Description : ");
                    String desc = scanner.nextLine();

                    System.out.print("Stock : ");
                    int stock = scanner.nextInt();

                    metier.add(new Product(newId, name, brand, price, desc, stock));
                    break;

                case 4:
                    System.out.print("ID à supprimer : ");
                    long delId = scanner.nextLong();
                    metier.delete(delId);
                    break;

                case 5:
                    metier.saveAll();
                    break;

                case 6:
                    System.out.println("Au revoir !");
                    return;

                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}
