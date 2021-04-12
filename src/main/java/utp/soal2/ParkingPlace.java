package utp.soal2;

import java.util.ArrayList;

public class ParkingPlace {
    private static int counter = 0;

    private ArrayList<ParkingTicket> listParkingTickets = new ArrayList<>();
    private int code;
    private int capacity = 50;

    public ParkingPlace() {
    }

    public void inCarCreateTicket(Car car) {
        this.code = counter;
        counter++;
        listParkingTickets.add(new ParkingTicket(car, this.code));
    }

    public void outCarDeleteTicket(int code) {
        listParkingTickets.remove(code);
    }

    public void getListInfo() {
        for (ParkingTicket parkingTicket : listParkingTickets) {
            parkingTicket.getInfo();
        }
    }

    public int totalCar() {
        return listParkingTickets.size();
    }

    public int availableCapacity() {
        return this.capacity - totalCar();
    }
}