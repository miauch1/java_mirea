public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    private final int CURRENT_YEAR = 2024;

    // Constructors
    public Car() {
        this.model = "Sckoda Octavia VRS";
        this.license = "E777KX777";
        this.color = "Nord Grey";
        this.year = 2017;
    }

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;

        if (year > 2024) this.year = CURRENT_YEAR;
        else this.year = year;
    }

    public Car(String color) {
        this.model = "Sckoda Octavia VRS";
        this.license = "E777KX777";
        this.color = color;
        int year = 2017;
    }

    // Get & set
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return this.model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year > CURRENT_YEAR) this.year = 2024;
        else this.year = year;
    }

    // Overrides methods

    @Override
    public String toString() {
        return "Model: " + model + "\nLicense: " + license + "\nColor: " + color + "\nYear: " + year + '\n';
    }

    // Other methods

    public int getAge() {
        return CURRENT_YEAR - year;
    }
}
