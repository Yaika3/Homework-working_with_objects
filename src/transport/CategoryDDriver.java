package transport;

public class CategoryDDriver extends Driver<Bus> {
    public CategoryDDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }
    public void go(Bus bus){
        System.out.println("Driver "+ getFullName() +" "+ bus.getBrand()+ " Go");
    }
    public void startMoving() {
        System.out.println("Bus Начать движение");
    }

    public void stopMoving() {
        System.out.println("Bus Закончить движение");
    }

}
