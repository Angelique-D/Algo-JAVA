import java.util.Random;
import java.util.Scanner;

// Schtroumpf
public class Exercice29 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static int[] arrayOne = new int[nbOfElementsInArray()];
    static int[] arrayTwo = new int[nbOfElementsInArray()];

    public static void main(String[] args) {
        randomNumberGenerator(arrayOne);
        randomNumberGenerator(arrayTwo);
        displayElementsInArray(arrayOne);
        displayElementsInArray(arrayTwo);
        calculatingTheSmurf(arrayOne, arrayTwo);

    }

    private static void displayElementsInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void calculatingTheSmurf(int[] arrayOne, int[] arrayTwo) {
        int sum = 0;
        String calculatedSmurf = "";
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                sum += arrayOne[i] * arrayTwo[j];
                calculatedSmurf += arrayOne[i] + " * " + arrayTwo[j];
                if (j == arrayTwo.length - 1 && i == arrayOne.length - 1) {
                    calculatedSmurf += " = " + sum;
                } else
                    calculatedSmurf += " + ";
            }
        }
        System.out.println(calculatedSmurf);
    }

    private static void randomNumberGenerator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2, 20);
        }
    }

    private static int nbOfElementsInArray() {
        System.out.println("Enter the number of elements in the array: ");
        return sc.nextInt();
    }
}
