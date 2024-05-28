public class Exercice05 {
    public static void main(String[] args) {
        String lastName = "Jean-Michel";
        String firstName = "DUPONT";

        showFirstNameLastName(firstName, lastName);

        // échanger les variables

        String switchName = lastName;
        lastName = firstName;
        firstName = switchName;

        showFirstNameLastName(firstName, lastName);
    }

    private static void showFirstNameLastName(String lastName, String firstName) {
        System.out.println("Nom : " + firstName);
        System.out.println("prénom : " + lastName);
    }
}
