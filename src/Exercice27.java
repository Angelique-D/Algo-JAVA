import java.util.Random;

public class Exercice27 {

    static Random myRandomGenerator = new Random();
    static int[] array = new int[6];

    public static void main(String[] args) {
        randomNumberGenerator(array);
    }

    private static void randomNumberGenerator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int newNumber;
            boolean isDuplicate;
            do {
                newNumber = myRandomGenerator.nextInt(1, 10);
                isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (newNumber == array[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            array[i] = newNumber;
            System.out.println("Boule n°"+ (i+1) + " : " + array[i] + " ");
        }
    }
}
