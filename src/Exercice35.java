import java.util.Scanner;

public class Exercice35 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez une valeur entière : ");
        int valeur = sc.nextInt();
        String charact = StringUtils.fizzBuzz(valeur);
        System.out.printf("Fizzbuzz " + valeur + " = " + charact);
    }
}
