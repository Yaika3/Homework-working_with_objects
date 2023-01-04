package transport;

public class Truck extends Transport {


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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


}
