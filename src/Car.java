public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    Car(String brand,String model,int year,String country,String color,double engineVolume){
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
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
