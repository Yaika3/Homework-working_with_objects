package transport;

public class CategoryDDriver <B extends Bus & Competing> {
    public CategoryDDriver( String fullName, String driversLicense, String experience) {

    }
    public void go(Bus bus){
        System.out.println("Driver "+ bus.getBrand()+ " Go");

    }

}
