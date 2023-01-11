package transport;

public class Truck extends Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private String numberOfMechanics;



    public Truck(String brand, String model, double engineVolume,String numberOfMechanics) {
        super(brand,model,engineVolume,numberOfMechanics);
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.numberOfMechanics =numberOfMechanics;

    }

    public String getNumberOfMechanics() {
        return numberOfMechanics;
    }

    @Override
    public String getModel() {
        return model;
    }

    public enum TransportType{
     //   TRANSPORT_TYPE("Truck");
    }
    public enum  LoadCapacity {
        LOAD_CAPACITY_N1(3.5),
      //  LOAD_CAPACITY_N2[3.5, 12];
        LOAD_CAPACITY_N3 (12);
        private double loadCapacity;


        public double getLoadCapacity() {
            return loadCapacity;
        }

        LoadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;



        }
    }
    @Override
    public void pitStop() {
        super.pitStop();
        System.out.println("Truck pitStop ");
    }
    public void bestLapTime(){
        super.bestLapTime();
        System.out.println("Truck bestLapTime");
    }
    public void maximumSpeed(){
        super.maximumSpeed();
        System.out.println("Truck maximumSpeed");
    }


}
