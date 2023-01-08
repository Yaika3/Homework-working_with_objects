package transport;

public class Driver  implements Competing {
    String fullName;
    String driversLicense;
    String experience;

    public Driver(String fullName, String driversLicense, String experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maximumSpeed() {

    }
}
