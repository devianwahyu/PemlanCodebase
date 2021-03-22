package bahas.soal1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Budi", "Malang");
        Person person2 = new Person("Joko", "Blitar");
        Car car1 = new Car("White", 1000, "Sedan");
        Car car2 = new Car("Black", 1500, "Pajero");

        Samsat samsat = new Samsat();
        samsat.createSTNK(person1, car1, "N 1234 CK");
        samsat.createSTNK(person2, car2, "AG 4321 AK");

        System.out.println("Jumlah STNK: " + samsat.getJumlahStnk());
        System.out.println("======================================");
        samsat.printAllInfoStnk();
    }
}
