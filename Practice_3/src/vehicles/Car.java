package vehicles;

public class Car {

    // fields
    private String ownerName;
    private int insuranceNumber;

    protected String engineType = "ICE";

    // constructor
    public Car(String ownerName, int insuranceNumber) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    // Get & set
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int number) {
        insuranceNumber = number;
    }

    public String getEngineType() {
        return engineType;
    }

    // Overrides
    @Override
    public String toString() {
        return String.format("Owner name: %s\nInsurance number: %d\nType of engine: %s\n",
                ownerName, insuranceNumber, engineType);
    }
}
