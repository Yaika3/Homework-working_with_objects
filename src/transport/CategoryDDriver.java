package transport;

public class CategoryDDriver <B extends Bus & Competing> {
    private String fullName;
    public CategoryDDriver( String fullName, String driversLicense, String experience) {
        this.fullName = fullName;
        if( this.fullName == null||fullName.isEmpty()){
            throw new RuntimeException();
        }

    }
    public void go(Bus bus){
        System.out.println("Driver "+ bus.getBrand()+ " Go");

    }

}
