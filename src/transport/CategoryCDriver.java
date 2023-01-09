package transport;

public class CategoryCDriver extends Driver<Truck> {

    public CategoryCDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }

    public void go(Truck truck){
        System.out.println("водитель А управляет автомобилем Б и будет участвовать в заезде");

    }
}
