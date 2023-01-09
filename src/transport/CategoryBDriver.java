package transport;

public class CategoryBDriver extends Driver<Car> {
    public CategoryBDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }

    public void go(Car car){
        System.out.println("Driver "+car.getModel()+ " Go");

    }


}
