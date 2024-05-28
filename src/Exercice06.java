import java.util.Scanner;

public class Exercice06 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int valeur;
        System.out.println("Saississez une valeur: ");
        valeur = sc.nextInt();
        if (valeur >= 0) {
            System.out.println("Alert !!!");
            System.out.println("La valeur est positive");
        }
        else
            System.out.println("La valeur est négative");
    }
}
