import transport.*;

import java.util.ArrayList;
import java.util.List;

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

        Bus lionsCoach = new Bus("MAN"," LionsCoach",5.0);
        Bus neoplan = new Bus("Neoman","Neoplan ",5.1);
        Bus volvoN = new Bus("Volvo ","Volvo 9500",5.0);
        System.out.println(lionsCoach.toString());
        System.out.println(neoplan.toString());
        System.out.println(volvoN.toString());

        Car audiR8 = new Car("Audi","R8 ",2020,"Germany","White","300",3.4,"автоматическая коробка передач","sedan","м142мм","4","Летняя");
        Bus volvoN1 = new Bus("Volvo ","volvoN ",5.0);
        Truck ram = new Truck("Dodge ","Ram",6.2);
        Truck raptor = new Truck("Ford ","Raptor",6.0);
        Truck fmx500 = new Truck("VOLVO ", "FMX-500-10X4 ", 6.5);
        ram.pitStop();
        ram.maximumSpeed();
        ram.bestLapTime();
        CategoryBDriver alex = new CategoryBDriver("Alex JB","B "," 20");
        CategoryCDriver Johan = new CategoryCDriver("Johan AF","C","10");
        CategoryDDriver Piter = new CategoryDDriver("Piter PP","D","14");
        audiR8.pitStop();
        audiR8.bestLapTime();
        audiR8.maximumSpeed();
        volvoN1.pitStop();
        volvoN1.bestLapTime();
        volvoN1.maximumSpeed();
        alex.go(audiR8);
        Johan.go(raptor);
        Piter.go(volvoN1);
        alex.startMoving();
        Johan.startMoving();
        Piter.startMoving();
        List<Transport> allCars = new ArrayList<>();
        allCars.add(audiA850LTDIQuattro);
        allCars.add(ladaGranta);
        allCars.add(bMWZ8);
        allCars.add(kiaSportage);
        allCars.add(hyundaiAvante);
        allCars.add(lionsCoach);
        allCars.add(neoplan);
        allCars.add(volvoN);
        allCars.add(audiR8);
        allCars.add(ram);
        allCars.add(raptor);
        allCars.add(fmx500);
        System.out.println(allCars);
        Mechanics Oleg = new Mechanics("Oleg Popov","Leto");
        Mechanics Boris = new Mechanics<>("Boris Petrov","Zima");
        Mechanics Elena = new Mechanics<>("Elena Nos","China");
        List allMechanics = new ArrayList<>();
        allMechanics.add(Oleg);
        allMechanics.add(Boris);
        allMechanics.add(Elena);
        List allDriver = new ArrayList();
        allDriver.add(alex);
        allDriver.add(Johan);
        allDriver.add(Piter);



    }
}



