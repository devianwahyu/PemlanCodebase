package utp.soal2;

public class Main {
    public static void main(String[] args) {

        // Instace cars
        Car car1 = new Car("Honda Jazz", "Black", "N 1234 BV");
        Car car2 = new Car("Honda Civic", "Silver", "B 1232 LK");
        Car car3 = new Car("Mistsubishi Pajero", "Black", "AG 666 LC");
        Car car4 = new Car("Mistsubishi Lancer", "Dark Blue", "AG 999 LC");
        Car car5 = new Car("Toyota Supra", "White", "L 4631 TS");
        Car car6 = new Car("Suzuki Swift", "Light Pink", "Z 0909 SS");
        Car car7 = new Car("Toyota AvanzA", "Yellow", "N 0000 TA");

        // Add parking car
        ParkingPlace parkingPlace = new ParkingPlace();
        parkingPlace.inCarCreateTicket(car1);
        parkingPlace.inCarCreateTicket(car2);
        parkingPlace.inCarCreateTicket(car3);
        parkingPlace.inCarCreateTicket(car4);

        // Check info
        // System.out.println("=========List Tiket=========");
        // parkingPlace.getListInfo();
        // System.out.println("============================");
        // System.out.println("Total car parking = " + parkingPlace.totalCar());
        // System.out.println("Available place = " + parkingPlace.availableCapacity());

        // Remove parking car
        parkingPlace.outCarDeleteTicket(1);
        // System.out.println("Mobil out 1");
        // System.out.println("============================");
        // System.out.println("Total car parking = " + parkingPlace.totalCar());
        // System.out.println("Available place = " + parkingPlace.availableCapacity());

        // Add new parking car
        parkingPlace.inCarCreateTicket(car5);
        parkingPlace.inCarCreateTicket(car6);

        // Check info
        parkingPlace.getListInfo();
        System.out.println("============================");
        System.out.println("Total car parking = " + parkingPlace.totalCar());
        System.out.println("Available place = " + parkingPlace.availableCapacity());
    }
}
