package transport;

public class Bus extends Transport{
  //  @Override
 //   public String toString() {
  //      return getBrand() + " " + getModel() + " " + getYear() + " " + getCountry()+ " " + getColor()+ " ";
  //  }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model,engineVolume);
    }
    public  void busbus(){
        System.out.println("Bus");
    }



}


