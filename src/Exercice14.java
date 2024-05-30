//import java.time.LocalDate;
//import java.util.Scanner;
//
//// Renvoie si c'est une date valide ou non
//
//public class Exercice14 {
//
//    static Scanner sc = new Scanner(System.in);
//    static byte days;
//    static byte months;
//    static short years;
//
//    public static void main(String[] args) {
//
//        LocalDate date = demandDate();
//        checkLeapYears(date);
//        validateDate();
//
//
//
//    }
//
//    private static void validateDate(LocalDate date) {
//        If(checkLeapYears(date))
//
//    }
//
//    private static LocalDate demandDate() {
//        System.out.print("Enter the number of days: ");
//        days = sc.nextByte();
//        System.out.print("Enter the number of months: ");
//        months = sc.nextByte();
//        System.out.print("Enter the number of years: ");
//        years = sc.nextShort();
//
//        return LocalDate.of(years, months ,days );
//    }
//
//
//    private static boolean checkLeapYears(LocalDate date) {
//        return (date.getYear() % 4 == 0 && date.getYear() % 100 != 0) || date.getYear() % 400 == 0;
//    }
//}
