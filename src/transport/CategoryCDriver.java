package transport;

public class CategoryCDriver <B extends Truck & Competing> {

    public CategoryCDriver( String fullName, String driversLicense, String experience) {

    }
    public void go(Truck truck){
        System.out.println("водитель А управляет автомобилем Б и будет участвовать в заезде");

    }
}
