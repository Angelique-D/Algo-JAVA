import java.util.Scanner;

/* Ecrivez un algorithme qui demande à l'utilisateur de saisir deux valeurs et
qui indique ensuite si leur produit est positif ou négatif */
public class Exercice08 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       System.out.println("Enter the first number: ");
       int firstValue = sc.nextInt();
       System.out.println("Enter the second number: ");
       int secondValue = sc.nextInt();

       boolean valuesAreNull = firstValue == 0 || secondValue == 0;
       boolean valuesArePositive = firstValue > 0 && secondValue > 0;
       boolean valuesAreNegative = firstValue < 0 && secondValue < 0;

       if(valuesAreNegative || valuesArePositive)
           System.out.println("the values are positive");
       else if (valuesAreNull)
           System.out.println("the values are null");
       else
           System.out.println("the values are negative");
    }
}
