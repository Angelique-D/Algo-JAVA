import java.util.Scanner;

public class Exercice22 {

    static Scanner sc = new Scanner(System.in);
    static int nb;

    public static void main(String[] args) {
        nb = requestANumber();
        showNb(nb);
    }

    private static void showNb(int nb) {
        int sum = 0;
        for (int i = 0; i <= nb; i++) {
            sum += i;
            System.out.print("F("+ i + ") = ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j < i)
                    System.out.print(" + ");
            }
            System.out.println(" = " + sum);
        }
    }

    private static int requestANumber() {
        System.out.println("Enter a number: ");
        return nb = sc.nextInt();
    }
}

