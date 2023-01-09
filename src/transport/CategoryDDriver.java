package transport;

public class CategoryDDriver extends Driver<Bus> {
    public CategoryDDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }

    public void go(Bus bus){
        System.out.println("Driver "+ bus.getBrand()+ " Go");

    }

}
