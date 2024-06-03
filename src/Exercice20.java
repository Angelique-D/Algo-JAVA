import java.util.Scanner;

public class Exercice20 {

    static Scanner sc = new Scanner(System.in);
    static int height;

    public static void main(String[] args) {

        createDiamond();
    }

    private static void createDiamond() {
        height = requestHeight();
        for (int i = 0; i <= height; i++) {
            addSpace(height, i);
            showStar(i);
            System.out.println();
        }

        for (int i = height - 1; i > 0; i--) {
            addSpace(height, i);
            showStar(i);
            System.out.println();
        }
    }

    private static void showStar(int i) {
        for (int k = 1; k <= (2 * i - 1); k++) {
            String star = "*";
            if (k == 1 || k == (2 * i - 1))
                System.out.print(star);
            else
                System.out.print(" ");
        }
    }

    private static void addSpace(int height, int i) {
        for (int j = height; j > i; j--) {
            System.out.print(" ");
        }
    }

    private static int requestHeight() {
        System.out.print("Enter the height: ");
        height = sc.nextInt();
        if (height % 2 == 0) {
            System.out.println("The height must be odd");
            height = requestHeight();
        }
        return height;
    }

}
