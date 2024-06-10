import java.util.Random;

public class Exercice34 {

    static Random rand = new Random();
    static int[] numbers = new int[20];

    /*
    * Remplir un tableau de 20 entiers avec des valeurs aléatoires
    * Afficher ce tableau
    * Inverser le tableau, afficher à nouveau ce tableau
    * */
    public static void main(String[] args) {
        randomNumberGenerator(numbers);
        reverseArray(numbers);
    }

    private static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        showArray(numbers);
    }

    private static void randomNumberGenerator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1, 50);
        }

        showArray(array);
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
