package transport;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private String maximumMovementSpeed;


    public Transport(String brand, String model, int year, String country, String color, String maximumMovementSpeed) {
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

        this.country = country;
        this.color = color;
        if(this.color == null||color.isEmpty()){
            this.color = " Белый цвет";
        }
        else this.color = color;
        maximumMovementSpeed = maximumMovementSpeed;
        if ( this.maximumMovementSpeed== null||country.isEmpty())
        { this.maximumMovementSpeed = "default";
        }
        else this.maximumMovementSpeed = maximumMovementSpeed;
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
}
