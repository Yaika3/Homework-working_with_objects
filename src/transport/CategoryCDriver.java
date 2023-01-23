package transport;

public class CategoryCDriver extends Driver<Truck> {

    public CategoryCDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }
    public void go(Truck truck){
        System.out.println("Driver "+getFullName() +" "+ truck.getModel() + " Go");}
    public void startMoving() {
        System.out.println("Truck Начать движение");
    }

    public void stopMoving() {
        System.out.println("Truck Закончить движение");
    }

}
