import java.util.Scanner;

public class Main {
    static Scanner myScanner = new Scanner(System.in);
   /* public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(3/ (float) 2);
        System.out.println(3f / 2);
    } */

    public static void main(String[] args) {
        String nom;
        String titre = "Madame";
        System.out.println("Entrez votre nom: ");
        nom = myScanner.nextLine();
        System.out.println("Bonjour " + nom);
        System.out.printf("Bonjour %s %s !", titre, nom);
    }
}