package vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, String ownerName, int year, int insuranceNumber, int batteryCapacity) {
        super(model, license, color, ownerName, year, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        engineType = "Electric";
    }

    @Override
    public String vehicleType() {
        return "ElectricCar";
    }

    @Override
    public String toString() {
        return super.toString() + "Capacity of battery: " + batteryCapacity + '\n';
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
