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

        System.out.println("Objects before refactoring");
        System.out.println(first + "\n" + second);

        first.setYear(2015);
        first.setOwnerName("Roman Azarov");

        second.setInsuranceNumber(777777777);

        System.out.println("Capacity of electric car's battery -> " + second.getBatteryCapacity() + "\n");

        System.out.println("Objects after refactoring");
        System.out.println(first + "\n" + second);
    }
}
