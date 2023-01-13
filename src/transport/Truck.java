package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, double engineVolume,String numberOfMechanics) {
        super(brand,model,engineVolume,numberOfMechanics);}

    public String getNumberOfMechanics() {
        return numberOfMechanics;}
    public String getModel() {
        return model;}

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
