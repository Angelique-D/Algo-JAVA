import java.util.Scanner;

/*Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
*Il lira au clavier l’heure et les minutes, et il affichera l’heure qu’il sera une minute plus tard.
*Par exemple, si l'utilisateur tape 21 puis 32, l'algorithme doit répondre :
*"Dans une minute, il sera 21 heure(s) 33".
*NB : on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la vérifier. */

public class Exercice10 {

    static Scanner sc = new Scanner(System.in);
    static byte hours;
    static byte minutes;
    static byte seconds;

    public static void main(String[] args) {


        System.out.print("Enter hours: ");
        hours = sc.nextByte();
        System.out.print("Enter minutes: ");
        minutes = sc.nextByte();
        System.out.print("Enter seconds: ");
        seconds = sc.nextByte();


        /*if (hours > 23)
            hours = 0;

        minutes += 1;

        if (minutes > 59) {
            minutes = 0;
            hours += 1;
        }*/

        /* if (minute == 59) {
            minute = 0;
            if (heure == 23)
                heure = 0;
            else
                heure++;
        } else {
            minute++;
        }
         */
        incrementSecond();
        System.out.println("Dans une minute, il sera " + hours + " heure(s) et " + minutes + " minutes. " + " et " + seconds + " secondes.");
    }

    private static void incrementSecond() {
        if (seconds >= 59){
            seconds = 0;
            minutes++;
            incrementMinute();

        } else {
            seconds++;
        }
    }

    private static void incrementMinute() {
        if (minutes > 59){
            minutes = 0;
            hours++;
            incrementHours();
        }
    }

    private static void incrementHours() {
        if ( hours >= 24){
            hours = 0;
        }
    }
}
