import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products = new ArrayList<>();
    private String fileName = "products.dat";

    public MetierProduitImpl() {
        loadFromFile();
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            oos.writeObject(products);
            System.out.println("Produits sauvegardés avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        File file = new File(fileName);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
