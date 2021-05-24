package bahas.soal3;

abstract public class Car {

    // Color option
    public static final String BLACK = "Black";
    public static final String WHITE = "White";

    // Engine type option
    public static final String ELECTRIC = "Electric";
    public static final String DIESEL = "Diesel";
    public static final String GASOLINE = "Gasoline";

    // Attributes
    private String manufacture;
    private String engineType;
    private String color;
    private String fuelStatus;
    private double price;

    public Car(String manufacture, String engineType, String color) {
        this.manufacture = manufacture;
        this.engineType = engineType;
        this.color = color;
    }

    public void setFuelStatus(String fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getPrice() {
        return enginePrice() + colorPrice();
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getFuelStatus() {
        return fuelStatus;
    }

    private double enginePrice() {
        double price = 0;
        switch (engineType) {
            case "Electric":
                price = 50000000;
                break;
            case "Diesel":
                price = 30000000;
                break;
            case "Gasoline":
                price = 40000000;
                break;
        }
        return price;
    }

    private double colorPrice() {
        double price = 0;
        switch (color) {
            case "Black":
                price = 2000000;
                break;
            case "White":
                price = 1000000;
                break;
        }
        return price;
    }

    abstract public String description();
}
