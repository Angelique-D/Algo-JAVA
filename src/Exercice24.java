import java.util.Scanner;

public class Exercice24 {

    static int nb = -1;
    static int sum = 0;
    static int amountDueByMe = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculateSum();
        amountDueByMe = amountPaidByClient(sum);
        System.out.println("Nous devons lui redonner un montant de :" + amountDueByMe + " euros.");
        refund(amountDueByMe);
    }

    private static void refund(int amountDueByMe) {
        while (amountDueByMe > 0) {
            if (amountDueByMe >= 100) {
                int count = amountDueByMe / 100;
                amountDueByMe %= 100;
                for (int i = 0; i < count; i++) {
                    if (amountDueByMe != 0) {
                        System.out.print(" 100 + ");
                    } else
                        System.out.print(" 100 ");
                }
            } else if (amountDueByMe >= 20) {
                int count = amountDueByMe / 20;
                amountDueByMe %= 20;
                for (int i = 0; i < count; i++) {
                    if (amountDueByMe != 0) {
                        System.out.print(" 20 + ");
                    } else
                        System.out.print(" 20 ");
                }
            } else if (amountDueByMe >= 10) {
                int count = amountDueByMe / 10;
                amountDueByMe %= 10;
                for (int i = 0; i < count; i++) {
                    if (amountDueByMe != 0) {
                        System.out.print(" 10 + ");
                    } else
                        System.out.print(" 10 ");
                }
            } else if (amountDueByMe >= 5) {
                int count = amountDueByMe / 5;
                amountDueByMe %= 5;
                for (int i = 0; i < count; i++) {
                    if (amountDueByMe != 0) {
                        System.out.print(" 5 + ");
                    } else
                        System.out.print(" 5 ");
                }
            } else {
                int count = amountDueByMe;
                amountDueByMe %= 1;
                for (int i = 0; i < count; i++) {
                    System.out.print(" 1 ");
                    if ( i < count - 1) {
                        System.out.print(" + ");
                    }
                }

            }
        }
    }

    private static int amountPaidByClient(int sum) {
        System.out.println("Montant payé par le client : ");
        int moneyFromClient = sc.nextInt();
        return moneyFromClient - sum;
    }

    private static void calculateSum() {
        while (nb != 0) {
            System.out.println("Entrez le prix de vos articles : ");
            nb = sc.nextInt();
            if (nb != 0) {
                sum += nb;
                System.out.println("Vous devez un total de : " + sum + " euros.");
            }
        }
        System.out.println("Total des articles : " + sum);
    }
}
