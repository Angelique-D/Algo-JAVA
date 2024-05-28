import java.util.Scanner;

// Ecrivez un algorithme qui demande à l'utilisateur le prix et la quantité d'un article, puis qui affiche le prix total

public class Exercice02 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        float price;
        short quantity;
        float sum;
        System.out.println("Entrez le prix unitaire de votre article: ");
        price = myScanner.nextFloat();
        System.out.println("Entrez la quantité: ");
        quantity = myScanner.nextShort();
        sum = price * quantity;
        System.out.printf("Bonjour, ca vous feras un total de %.2f euros", sum );
    }
}
