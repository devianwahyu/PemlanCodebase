package utp.soal2;

public class Car {
    private final String merk;
    private final String color;
    private final String platNum;

    public Car(String merk, String color, String platNum) {
        this.merk = merk;
        this.color = color;
        this.platNum = platNum;
    }

    public String getMerk() {
        return merk;
    }

    public String getColor() {
        return color;
    }

    public String getPlatNum() {
        return platNum;
    }
}
