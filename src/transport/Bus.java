package transport;

public class Bus extends Transport{
  //  @Override
 //   public String toString() {
  //      return getBrand() + " " + getModel() + " " + getYear() + " " + getCountry()+ " " + getColor()+ " ";
  //  }
private String brand;
private String model;
private double engineVolume;
    public Bus(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);
        this.model=model;
        this.brand=brand;
        this.engineVolume=engineVolume;
    }

    @Override
    public void pitStop() {
        super.pitStop();
        System.out.println("Bus pitStop ");
    }
    public void bestLapTime(){
        super.bestLapTime();
        System.out.println("Bus bestLapTime");
    }
    public void maximumSpeed(){
        super.maximumSpeed();
        System.out.println("Bus maximumSpeed");
    }




}


