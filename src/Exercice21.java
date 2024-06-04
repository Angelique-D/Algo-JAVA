import java.util.Scanner;

// Créer une méthode qui renvoie les valeurs factorielles d'un nombre
public class Exercice21 {

    static Scanner sc = new Scanner(System.in);
    static int nb;

    public static void main(String[] args) {
        nb = requestANumber();
        createAFactorNumber(nb);
    }

    private static void createAFactorNumber(int nb) {
        int factor = 1;
        for (int i = nb; i > 0; i--) {
            factor *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            } else
                System.out.print(" = " + factor);
        }
    }

    private static int requestANumber() {
        System.out.println("Enter a number: ");
        return nb = sc.nextInt();
    }
}
