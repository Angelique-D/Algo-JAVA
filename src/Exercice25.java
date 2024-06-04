import java.util.Scanner;

// Dire si oui ou non le nombre est premier
public class Exercice25 {

    static Scanner sc = new Scanner(System.in);
    static int nb;

    public static void main(String[] args) {

       boolean isFirst = primeNumber(requestNb());
       if (isFirst)
           System.out.println("Prime number");
       else
           System.out.println("Not Prime number");

    }

    private static boolean primeNumber(int nb) {
        boolean isFirst = nb >= 2;
        int counter = 2;
        while (isFirst && counter * counter <= nb) {
            isFirst = (nb % counter > 0);
            counter++;
        }
        return isFirst;
    }

    private static int requestNb() {
        System.out.println("Entrez un nombre: ");
        nb = sc.nextInt();
        return nb;
    }
}
