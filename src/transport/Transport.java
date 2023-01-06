package transport;

import java.sql.Driver;
import java.util.Date;

public class Transport implements Competing {
    public static String PIT_STOP = "Пит-стоп ";
    public static String BEST_LAP_TIME = "Лучшее время круга";
    public static String MAXIMUM_SPEED = "Максимальная скорость ";

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
    }

    @Override
    public void pitStop() {
        System.out.println(PIT_STOP);
    }

    @Override
    public void bestLapTime() {
        System.out.println(BEST_LAP_TIME);

    }

    @Override
    public void maximumSpeed() {
        System.out.println(MAXIMUM_SPEED);

    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }


    private int year;
    private String country;
    private String color;
    private String maximumMovementSpeed;


    public Transport(String brand, String model, int year, String country, String color, String maximumMovementSpeed) {
        this.brand = brand;
        if (this.brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        this.model = model;
        if (this.model == null || model.isEmpty()) {
            this.model = "default";

        } else this.model = model;
        this.year = year;

        this.country = country;
        this.color = color;
        if (this.color == null || color.isEmpty()) {
            this.color = " Белый цвет";
        } else this.color = color;
        maximumMovementSpeed = maximumMovementSpeed;
        if (this.maximumMovementSpeed == null || country.isEmpty()) {
            this.maximumMovementSpeed = "default";
        } else this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getMaximumMovementSpeed() {
        return maximumMovementSpeed;
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
                '}';
    }

    public void PassDiagnostics() throws Exception {
        if (brand.isEmpty())
            throw new Exception("Ошибка");


    }
}
