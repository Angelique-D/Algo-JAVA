public class Exercice17 {

    //Faire un triangle
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + "*".repeat(i));
        }

        for (int i = 1; i <= 10; i++) {
            String star = " ";
            for (int j = 1; j < i; j++) {
                star += "*";
            }
            System.out.println(star);
        }
    }
}
