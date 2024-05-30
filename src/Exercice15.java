public class Exercice15 {

     static String colorPrice = "";

    public static void main(String[] args) {
        
        Conducteur charles = new Conducteur(25, 2, 0, 6);

        String color = whatIsYourPrice(charles);

        if (charles.getLoyaltyPrice() >= 5) {
            switch (color){
                case "Red":
                    colorPrice = "Orange";
                    break;
                case "Orange":
                    colorPrice = "Green";
                    break;
                case "Green":
                    colorPrice = "Blue";
                    break;
                default:
                    System.err.println("Erreur dans le programme de fidélité");
            }
        }

        System.out.println("Merci de votre fidelité, votre prix est passé de " + color + " à " + colorPrice);

    }

    private static String whatIsYourPrice(Conducteur charles) {

        if(charles.getAge() <= 25 && charles.getDriverLicenseYears() <= 2) {
            if(charles.getHowManyAccident() == 0) {
                colorPrice = "Red";
                System.out.println("Votre tarif est rouge");
            }
            else
                System.out.println("Vous êtes refusé");
        } else if (charles.getAge() <= 25 && charles.getDriverLicenseYears() > 2 || charles.getAge() > 25 && charles.getDriverLicenseYears() <= 2) {
            if(charles.getHowManyAccident() == 0) {
                colorPrice = "Orange";
                System.out.println("Votre tarif est orange");
            }
            else if (charles.getHowManyAccident() == 1) {
                colorPrice = "Red";
                System.out.println("Votre tarif est rouge");
            }
            else
                System.out.println("Vous êtes refusé");
        } else if (charles.getAge() > 25 && charles.getDriverLicenseYears() > 2) {
            if (charles.getHowManyAccident() == 0) {
                colorPrice = "Green";
                System.out.println("Votre tarif est vert");
            }
            else if (charles.getHowManyAccident() == 1) {
                colorPrice = "Orange";
                System.out.println("Votre tarif est orange");
            }
            else if (charles.getHowManyAccident() == 2) {
                colorPrice = "Red";
                System.out.println("Votre tarif est rouge");
            } else
                System.out.println("Vous êtes refusé");
        }
        return colorPrice;
    }

}
