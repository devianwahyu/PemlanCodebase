package bahas.soal1;

public class Car {
    public String color;
    public int CC;
    private String typeName;

    public Car(String color, int CC, String typeName) {
        this.color = color;
        this.CC = CC;
        this.typeName = typeName;
    }

    public String getColor() {
        return color;
    }

    public int getCC() {
        return CC;
    }

    public String getTypeName() {
        return typeName;
    }
}
