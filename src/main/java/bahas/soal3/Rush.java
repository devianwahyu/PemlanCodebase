package bahas.soal3;

public class Rush extends Car implements GasolineEngine{

    private boolean theFuel;

    public Rush(String manufacture, String engineType, String color, boolean status) {
        super(manufacture, engineType, color);
        fillingUpGasoline(status);
        fuelStatusCheck();
    }

    @Override
    public String description() {
        return "This car is good";
    }

    @Override
    public void fillingUpGasoline(boolean status) {
        theFuel = status;
    }

    private void fuelStatusCheck() {
        if (theFuel) {
            setFuelStatus("Full");
        } else {
            setFuelStatus("Empty");
        }
    }

    @Override
    public void setFuelStatus(String fuelStatus) {
        super.setFuelStatus(fuelStatus);
    }

    @Override
    public String toString() {
        return "Manufacture: " + getManufacture() + "\n" +
                "Engine Type: " + getEngineType() + "\n" +
                "Color: " + getColor() + "\n" +
                "Fuel Status: " + getFuelStatus() + "\n" +
                "Price: " + getPrice() + "\n";
    }
}
