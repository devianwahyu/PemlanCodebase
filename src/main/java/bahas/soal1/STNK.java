package bahas.soal1;

public class STNK {
    private String nopol;
    private Car car;
    private Person owner;

    public STNK(String nopol, Car car, Person person) {
        this.nopol = nopol;
        this.car = car;
        this.owner = person;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getNopol() {
        return nopol;
    }

    public void getInfo() {
        System.out.println("Nomer Polisi: " + nopol + "\n" +
                "Nama Owner: " + owner.getName() + "\n" +
                "Alamat Owner: " + owner.getAddress() + "\n" +
                "Warna Mobil: " + car.getColor() + "\n" +
                "CC Mobil: " + car.getCC() + "\n" +
                "Tipe Mobil: " + car.getTypeName() + "\n");
    }
}
