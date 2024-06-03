import java.util.Scanner;

// Faire un rectangle
public class Exercice19 {

    static Scanner sc = new Scanner(System.in);
    static int height;
    static int width;

    public static void main(String[] args) {
        height = requestHeight();
        width = requestWidth();

        showRectangle(height, width);
    }

    private static void showRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static int requestWidth() {
        System.out.print("Enter width: ");
        return sc.nextInt();
    }

    private static int requestHeight() {
        System.out.println("Enter height: ");
        return sc.nextInt();
    }
}
