import java.util.Scanner;

public class Exercice01 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nom;
        Number age; // or byte
        System.out.println("Entrez votre nom: ");
        nom = myScanner.nextLine();
        System.out.println("Entrez votre age: ");
        age = myScanner.nextByte();
        System.out.printf("Bonjour %s, vous avez %s ans", nom, age);
    }
}
