package app;
import vehicles.Car;
import vehicles.ElectricCar;


public class Main {
    public static void main(String[] args) {
        Car a = new Car("Roma", 123456);
        ElectricCar b = new ElectricCar("Ivan", 123123, 4000);

        System.out.println(a);
        System.out.println(b);

        // System.out.println(b.engineType) don't work - nice;
        System.out.println(a.getEngineType()); // protected through public method
        System.out.println(b.getOwnerName()); // private through public method
        System.out.println(b.getEngineType()); // protected(from Car class) through public method
    }
}
