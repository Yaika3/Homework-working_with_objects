package transport;

public class Car {

   private String brand;
    private String model;
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
    // Научился объеденять гетеры в 1 метод))))....по поводу final, если ставлю модификатор,то при проверке if не присваевае значение...можно добавить данные проверки в сетер.
// единственное не понял как создать метод проверки номера...там же и буквы и цифры...какого типа переменная? и какие символы проверять? если по всей длине идти,
    // метод Character.isDigit покажет что буквы не являются цифрами ?? запутался
    //если по длинне строки идти, потом через if х000хх000 а дальше не понимаю




    public Car(String brand,String model,int year,String country,String color,double engineVolume,String transmission,String bodyType,String registrationNumber,String numberOfSeats,String carTyre){
        this.brand = brand;
        if ( this.brand == null|| brand.isEmpty())
        { this.brand = "default";
        }
        else this.brand = brand;

        this.model = model;
        if ( this.model == null||model.isEmpty())
        { this.model = "default";

        }
        else this.model = model;

        this.year = year;
        if (this.year <= 0){
            this.year = 2000;
        }else this.year = year;

        this.country= country;
        if ( this.country == null||country.isEmpty())
        { this.country = "default";
        }
        else this.country = country;

        this.color = color;
        if(this.color == null||color.isEmpty()){
            this.color = " Белый цвет";
        }else this.color = color;

        this.engineVolume = engineVolume;
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

     // Character.isDigit("х000хх000");
        this.numberOfSeats=numberOfSeats;


        if ( season== true){
            this.carTyre="Летняя";
        }
        else {
            this.carTyre= "Зимняя";
        }




    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
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

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getYear() + " " + getCountry()+ " " + getColor()+ " " + getEngineVolume()+ " " + getTransmission()+ " " + getBodyType()+ " " + getRegistrationNumber()+ " " + getNumberOfSeats()+ " " + getCarTyre();
    }
}
