package transport;

public class CategoryCDriver extends Driver<Truck> {

    public CategoryCDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }

    public void go(Driver t){
        System.out.println("водитель А управляет автомобилем Б и будет участвовать в заезде");

    }
    public void startMoving() {
        System.out.println("Truck Начать движение");
    }

    public void stopMoving() {
        System.out.println("Truck Закончить движение");
    }
}
