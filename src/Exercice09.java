import java.util.Scanner;

public class Exercice09 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;

        System.out.println("Enter the first number: ");
        numberOne = sc.nextInt();
        System.out.println("Enter the second number: ");
        numberTwo = sc.nextInt();
        System.out.println("Enter the third number: ");
        numberThree = sc.nextInt();

        boolean ascending = numberOne <= numberTwo && numberOne <= numberThree && numberTwo <= numberThree;
        boolean descending  =  numberThree <= numberTwo && numberTwo <= numberOne;

        if (ascending)
            System.out.println("Ascending: " + numberOne + " + " + numberTwo + " + " + numberThree);
        else if (descending )
            System.out.println("Descending: " + numberOne + " + " + numberTwo + " + " + numberThree);
        else
            System.out.println("Not good");
    }
}
