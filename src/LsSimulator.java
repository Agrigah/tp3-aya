import java.io.File;
import java.util.Scanner;

public class LsSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le chemin complet du dossier : ");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Chemin invalide ou ce n'est pas un dossier.");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                String type = file.isDirectory() ? "<DIR>" : "<FILE>";
                String permissions = "";

                permissions += file.canRead() ? "r" : "-";
                permissions += file.canWrite() ? "w" : "-";
                permissions += file.isHidden() ? "h" : "-";

                System.out.println(file.getAbsolutePath() + " " + type + " " + permissions);
            }
        }
    }
}
