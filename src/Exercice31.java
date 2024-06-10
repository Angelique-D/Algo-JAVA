import java.util.Random;

// Tri à bulles
public class Exercice31 {

    static int[] nbArray = new int[11];
    static Random rand = new Random();

    public static void main(String[] args) {
        randomNbGenerator(nbArray);
        System.out.println("Le tableau avant le tri : ");
        showArray(nbArray);

        bubbleSort(nbArray);

        System.out.println("Le tableau après le tri : ");
        showArray(nbArray);
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void randomNbGenerator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1,50);
        }
    }
}
