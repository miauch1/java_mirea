package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {

        Car first = new Car("AUDI Q8 Sportback e-tron",
                            "A888AA97",
                            "matte Nord Grey",
                            "Roma",
                            2018,
                            111222333);

        ElectricCar second = new ElectricCar("Li one",
                                             "E123EE777",
                                             "Black",
                                             "Roma",
                                             2022,
                                             123456789,
                                             4000);

        first.setYear(2022);
        second.setColor("Grey");

        System.out.println(first);
        System.out.println(second);
    }
}
