import java.util.Scanner;

public class Exercice03 {
    /* Ecrire un algo qui demande le prix hors taxes et la quantité d'un article,
    puis qui affiche le prix total en tenant compte d'une TVA à 20%*/
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        float priceHT;
        float priceTTC;
        short quantity;
        float sum;
        final float TVA = 0.2f;
        System.out.println("Entrez le prix hors taxes de votre article: ");
        priceHT = myScanner.nextFloat();
        System.out.println("Entrez la quantité: ");
        quantity = myScanner.nextShort();
        priceTTC = priceHT * (1 + TVA);
        priceTTC = Math.round(priceTTC * 100) / 100f;
        sum = priceTTC * quantity;
        System.out.printf("Bonjour, vous devez payer un total de %.2f euros", sum );
    }
}
