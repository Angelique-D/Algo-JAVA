import java.util.Scanner;

/* Les habitants de Zorglub paient l'impot selon les règles suivantes :
   *Les hommes de plus de 20 paient l'impot
   * Les femmes paient de l'impot si elles ont entre 18 et 35 ans
   * Les autres ne paient pas d'impôt
   Le programme demandera donc l'age et le sexe et se prononcera ensuite sur le fait que l'habitant est imposable.
 */
public class Exercice12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String sex;
        int age;

        System.out.print("Enter age in years: ");
        age = sc.nextInt();
        System.out.println("Enter your sex: ");
        sex = sc.next();

        boolean tax = (sex.equals("Homme") && age > 20) || (sex.equals("Femme") && age >= 18 && age <= 35);

        if (tax)
            System.out.println("You are taxy!");
        else
            System.out.println("You are not taxy!");

    }
}
