package transport;

public class CategoryBDriver <B extends Car & Competing> {
    public CategoryBDriver( String fullName, String driversLicense, String experience) {

    }

    public void go(Car car){
        System.out.println("Driver "+ car.getBrand()+ " Go");

    }

}
