public class Conducteur {
    final private int age;
    final private int driverLicenseYears;
    final private int howManyAccident;
    final private int loyaltyPrice;

    public Conducteur(int age, int driverLicenseYears, int howManyAccident, int loyaltyPrice) {
        this.age = age;
        this.driverLicenseYears = driverLicenseYears;
        this.howManyAccident = howManyAccident;
        this.loyaltyPrice = loyaltyPrice;
    }

    public int getAge() {
        return age;
    }

    public int getDriverLicenseYears() {
        return driverLicenseYears;
    }

    public int getHowManyAccident() {
        return howManyAccident;
    }

    public int getLoyaltyPrice() {
        return loyaltyPrice;
    }
}
