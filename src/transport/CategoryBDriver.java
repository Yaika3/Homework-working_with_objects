package transport;

public class CategoryBDriver <B extends Car & Competing > {
    String fullName;
    String driversLicense;
    String experience;
    public CategoryBDriver(String fullName, String driversLicense, String experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

}
