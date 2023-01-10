package transport;

public class CategoryBDriver extends Driver<Car> {
    public CategoryBDriver(String fullName, String driversLicense, String experience) {
        super(fullName, driversLicense, experience);
    }
    public void startMoving() {
        System.out.println("Car Начать движение");
    }
    public void stopMoving() {
        System.out.println("Car Закончить движение");
    }
    public void go(){
        System.out.println("Driver "+ fullName +  " Go");

    }


}
