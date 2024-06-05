import java.util.Random;
import java.util.Scanner;

public class Exercice28 {

    static Scanner sc = new Scanner(System.in);
    static Random myRandomGenerator = new Random();
    static int[] array = new int[nbValueOfArray()];

    public static void main(String[] args) {
        numberGenerator(array);
    }

    private static void numberGenerator(int[] array) {
        int[] frequencies = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = myRandomGenerator.nextInt(1, 11);
            frequencies[array[i]]++;
            System.out.println("N°"+ (i + 1) + " : " + array[i]);
        }

        displayFrequencies(frequencies);
    }

    private static void displayFrequencies(int[] frequencies) {
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0)
            System.out.println("N° " + i + " : " + frequencies[i] + " fois.");
        }
    }

    private static int nbValueOfArray() {
        System.out.print("Enter the size of the array: ");
        return sc.nextInt();
    }
}


