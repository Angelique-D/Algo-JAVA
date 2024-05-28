import java.util.Scanner;

public class Exercice04 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;
        float average;
        System.out.println("Entrez un premier nombre: ");
        number1 = myScanner.nextInt();
        System.out.println("Entrez un deuxième nombre: ");
        number2 = myScanner.nextInt();
        average = (number1 + number2) / 2f;
        System.out.printf("La moyenne de vos nombres est de " + average);

    }
}

