package transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Transport implements Competing {
    public static String PIT_STOP = "Пит-стоп ";
    public static String BEST_LAP_TIME = "Лучшее время круга";
    public static String MAXIMUM_SPEED = "Максимальная скорость ";
    private String brand;
    String model;
    private double engineVolume;
    private String numberOfMechanics;
    private int year;
    private String country;
    private String color;
    private String maximumMovementSpeed;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private String numberOfSeats;
    private String carTyre;
   // private List mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume,String numberOfMechanics) {
        this.brand = brand;
        if (this.brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.numberOfMechanics=numberOfMechanics;}
    public Transport(String brand, String model, int year, String country, String color, String maximumMovementSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, String numberOfSeats, String carTyre) {
        this.brand =brand;
        this.model=model;
        this.year = year;
        this.country = country;
        this.color = color;
        if (this.color == null || color.isEmpty()) {
            this.color = " Белый цвет";
        } else this.color = color;
        if (this.maximumMovementSpeed == null || country.isEmpty()) {
            this.maximumMovementSpeed = "default";
        } else this.maximumMovementSpeed = maximumMovementSpeed;
        this.engineVolume = engineVolume;
        this.transmission =transmission;
        this.bodyType=bodyType;
        this.registrationNumber=registrationNumber;
        this.numberOfSeats=numberOfSeats;
        this.carTyre=carTyre;
    }
//    public void addMechanics(Mechanics mechanic){
//        mechanics.add(mechanic);}


    public String getBrand() {
        return brand;}
    public String getModel() {
        return this.model;}

    public int getYear() {
        return year;}

    public String getCountry() {
        return country;}

    public String getColor() {
        return color;}

    public String getMaximumMovementSpeed() {
        return maximumMovementSpeed;}
    public double getEngineVolume() {return engineVolume;}

    public String getNumberOfMechanics() {
        return numberOfMechanics;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maximumMovementSpeed='" + maximumMovementSpeed + '\'' +
                '}';}

    public void passDiagnostics() throws Exception {
        if (brand.isEmpty())
            throw new Exception("Ошибка");}
    @Override
    public void pitStop() {
        System.out.println(PIT_STOP);}

    @Override
    public void bestLapTime() {
        System.out.println(BEST_LAP_TIME);}

    @Override
    public void maximumSpeed() {
        System.out.println(MAXIMUM_SPEED);
    }

}
