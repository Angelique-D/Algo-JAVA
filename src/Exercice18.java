import java.util.Scanner;

// Faire un sapin
public class Exercice18 {

    static Scanner sc = new Scanner(System.in);
    static int nbLine;

    public static void main(String[] args) {
        int nbLine = requestNbLine();

        showPyramid(nbLine);
    }

    private static void showPyramid(int nbLine) {
        for (int i = 1; i <= nbLine; i++) {
            showSpace(nbLine, i);
            showStar(i);
            System.out.println();
        }
    }

    private static void showStar(int i) {
        for (int k = 1; k <= (2 * i - 1); k++) {
            String star = "*";
            System.out.print(star);
        }
    }

    private static void showSpace(int nbLine, int i) {
        for (int j = nbLine; j > i; j--) {
            System.out.print(" ");
        }
    }

    private static int requestNbLine() {
        System.out.println("Veuillez entrer le nombre de ligne voulu:");
         return nbLine = sc.nextInt();
    }
}
