package utp.soal2;

public class ParkingTicket {
    private Car car;
    private int code;

    public ParkingTicket(Car car, int code) {
        this.car = car;
        this.code = code;
    }

    public void getInfo() {
        System.out.println("\nMerk: " + car.getMerk() + "\nColor: " + car.getColor() + "\nPlat: " + car.getPlatNum()
                + "\nParking Code: " + code);
    }
}
