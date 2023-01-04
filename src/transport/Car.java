package transport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }





    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private String numberOfSeats;
    boolean season;
    private String carTyre;


   public Car(String brand, String model, int year, String country, String color, String maximumMovementSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, String numberOfSeats, String carTyre) {
        super(brand, model, year, country, color, maximumMovementSpeed);
        this.season = season;



       this.year = year;
       if (this.year <= 0){
           this.year = 2000;
       }else this.year = year;

       this.country= country;

       this.color = color;
       if(this.color == null||color.isEmpty()){
           this.color = " Белый цвет";
       }else this.color = color;

       if (engineVolume <= 0){
           this.engineVolume = 1.5;
       }else this.engineVolume = engineVolume;

       this.transmission=transmission;
       if ( this.transmission == null||transmission.isEmpty())
       { this.transmission = "default";
       }
       this.bodyType=bodyType;
       if ( this.bodyType == null||bodyType.isEmpty())
       { this.bodyType = "default";
       }
       this.registrationNumber = registrationNumber;

     //  Character.isDigit("х000хх000");
       this.numberOfSeats=numberOfSeats;


       if ( season== true){
           this.carTyre="Летняя";
       }
       else {
           this.carTyre= "Зимняя";
       }
   }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
   }


    public void setColor(String color) {
        this.color = color;
   }


   public void setYear(int year) {
        this.year = year;
    }


    public void setCountry(String country) {
       this.country = country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
       this.numberOfSeats = numberOfSeats;
    }

    public String getCarTyre() {
        return carTyre;
    }

    public void setCarTyre(String carTyre) {
        this.carTyre = carTyre;
    }
    public static class Key {
      private String remoteEngineStart;
     private String keylessAccess;

      public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart() {
           return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
           if ( this.remoteEngineStart == null||remoteEngineStart.isEmpty())
            { this.remoteEngineStart = "default";
           }


        }

       public String getKeylessAccess() {
            return keylessAccess;
       }

      public void setKeylessAccess(String keylessAccess) {
           this.keylessAccess = keylessAccess;
           if ( this.keylessAccess == null||keylessAccess.isEmpty())
           { this.keylessAccess = "default";
           }
        }
    }
   public static class Insurance {
       private final int insuranceCost;
       private final int insuranceNumber;



        public Insurance(int insuranceCost, int insuranceNumber) {
           this.insuranceCost = insuranceCost;
            this.insuranceNumber = insuranceNumber;
        }

        public int getInsuranceCost() {
            return insuranceCost;
        }

        public int getInsuranceNumber() {
            return insuranceNumber;
        }

    }
    final static String DATE_FORMAT = "dd-MM-yyyy";
    public static boolean isDateValid(String date)
   {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public String carCar(){
        return "carcar";

    }

}
