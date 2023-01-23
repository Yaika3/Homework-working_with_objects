package transport;

public abstract class Driver <T extends Transport & Competing> {
   private String fullName;
    private String driversLicense;
    private String experience;
    public Driver(String fullName, String driversLicense, String experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }
    public void startMoving() {
        System.out.println("Начать движение");
    }
    public void stopMoving() {
        System.out.println("Закончить движение");
    }
    public abstract void go(T t);
    public String getFullName() {
        return fullName;
    }
    public String getDriversLicense() {
        return driversLicense;
    }
    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense='" + driversLicense + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
