import java.util.Scanner;

public class Exercice16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Saississez une valeur:");
        byte value = sc.nextByte();
        int sum;

        for (int i = 1; i <= 10; i++) {
            sum = i * value;
            System.out.println( sum + " = " + i + " x " + value );
        }
    }
}
