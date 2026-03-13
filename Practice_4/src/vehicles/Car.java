package vehicles;

public class Car extends Vehicle {

    public Car(String model, String license, String color, String ownerName, int year, int insuranceNumber) {
        super(model, license, color, ownerName, year, insuranceNumber);
        engineType = "Combustion";
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
