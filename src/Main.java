import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(""," Granta",2015,"сборка в России","желтого цвета","300",1.7,"автоматическая коробка передач","sedan","м101мм","4","Летняя");
        Car audiA850LTDIQuattro = new Car("Audi "," A 8 50 L TDI quattro ",2020,"сборка в Германии","черный цвет","300",3.7,"автоматическая коробка передач","sedan","м104мм","Летняя","Летняя");
        Car bMWZ8 = new Car("BMW ","Z8 ",2021,"сборка в Германии","черный цвет","320",3.0,"автоматическая коробка передач","sedan","м102мм","4","Летняя");
        Car kiaSportage = new Car("Kia","Sportage", 2018,"сборка в Южной Корее","цвет кузова — красный","300",2.4,"автоматическая коробка передач","sedan","м103мм","4","Летняя");
        Car hyundaiAvante = new Car("Hyundai "," Avante",2016,"сборка в Южной Корее","цвет кузова — оранжевый","300",1.3,"автоматическая коробка передач","sedan","м105мм","4","Летняя");
        Car nulL = new Car(null,null,2000,"сборка в Южной Корее",null,"300",-1.3,"автоматическая коробка передач","sedan","м107мм","4","Летняя");
        System.out.println(ladaGranta.toString());
        System.out.println(audiA850LTDIQuattro.toString());
        System.out.println(bMWZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
        System.out.println(nulL.toString());

        Bus lionsCoach = new Bus("MAN"," LionsCoach",2020,"Сборочный завод, Турция","Белый","180");
        Bus neoplan = new Bus("Neoman","Neoplan ",2019,"Сборочный завод, Турция","Серый","170");
        Bus volvoN = new Bus("Volvo ","Volvo 9500",2021,"Сборка в Германии","Синий","190");
        System.out.println(lionsCoach.toString());
        System.out.println(neoplan.toString());
        System.out.println(volvoN.toString());


    }
}



