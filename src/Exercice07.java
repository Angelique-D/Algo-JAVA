import java.util.Scanner;

public class Exercice07 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        byte status;
        System.out.println("Saississez le nb d'années que vous exercez le métier de développeur: ");
        status = sc.nextByte();
        if (status >= 0 && status <= 3)
            System.out.println("Vous êtes un développeur(se) junior");
        else if (status > 3 && status <= 80)
            System.out.println("Vous êtes un développeur(se) senior");
        else
            System.out.println("Vous avez rentré un nombre invalide");
    }
}
