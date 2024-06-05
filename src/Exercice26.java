import java.util.Scanner;

// pas fini
public class Exercice26 {

    static Scanner sc = new Scanner(System.in);
    static byte nbNote;
    static float average;
    static int sum;

    public static void main(String[] args) {
        requestNbNote();
        int[] notes = new int[nbNote];
        enterYourNotes(notes);
        calculateAverage(notes);
        calculateDeviation(average, notes);
    }

    private static void calculateDeviation(float average, int[] notes) {

    }

    private static void enterYourNotes(int[] notes) {
        for (int i = 0; i < nbNote; i++) {
            System.out.print("Enter note: ");
            notes[i] = sc.nextInt();


        }
        for (int i = 0; i < nbNote; i++) {
            System.out.print(notes[i] + " ");
        }
    }

    private static void calculateAverage(int[] notes) {
        for (int i = 0; i < nbNote; i++) {
            sum += notes[i];
            average = sum / nbNote;
        }
        System.out.println("Average note: " + average);
    }

    private static int requestNbNote() {
        System.out.print("Enter number note if you need: ");
        return nbNote = sc.nextByte();
    }
}
