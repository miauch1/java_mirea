package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private String ownerName;
    private int year;
    private int insuranceNumber;

    protected String engineType;

    public Vehicle(String model, String license, String color, String ownerName, int year, int insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.ownerName = ownerName;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2024) this.year = 2024;
        this.year = year;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return String.format("Model: %s\nLicense: %s\nColor: %s\nOwner name: %s\nYear: %d\nNumber of insurance: %d\nType of engine: %s\n",
                model, license, color, ownerName, year, insuranceNumber, engineType);
    }
}
