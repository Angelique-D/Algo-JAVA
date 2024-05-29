import java.util.Scanner;

/* Un magasin de reprographie facture 0,10e les dix premières photocopies, 0.09e les vingt suivantes et 0.08e, au delà.
Ecrivez un algorithme qui demande à l'utilisateur le nombre de photocopies effectuées et
qui affiche la facture correspondante. */

public class Exercice11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nbCopies;
        double bill;

        System.out.println("How many copies?");
        nbCopies = sc.nextByte();

        if (nbCopies <= 10) {
            bill = nbCopies * 0.10;
        } else {
            if (nbCopies <= 30) {
                nbCopies = nbCopies - 10;
                bill = nbCopies * 0.09 + 1;
            } else {
                nbCopies = nbCopies - 30;
                bill = nbCopies * 0.08 + 2.8;
            }
        }

        System.out.println("Votre facture s'élèvera à : " + String.format("%.2f", bill) + " euros. ");

    }
}
