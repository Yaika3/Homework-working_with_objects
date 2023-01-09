package transport;

public class Driver <T extends Transport & Competing> {
    String fullName;
    String driversLicense;
    String experience;

    public Driver(String fullName, String driversLicense, String experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public void pitStop() {
    }

    public void bestLapTime() {
    }

    public void maximumSpeed() {
    }
}
