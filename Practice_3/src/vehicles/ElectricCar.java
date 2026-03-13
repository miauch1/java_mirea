package vehicles;

public class ElectricCar extends Car {

    // fields
    private int batteryCapacity;

    // constructor
    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        engineType = "Electric";
    }

    // Get & set
    public void setBatteryCapacity (int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Overrides
    @Override
    public String toString() {
        return super.toString() + "Capacity of battery: " + batteryCapacity + "\n";
    }
}
