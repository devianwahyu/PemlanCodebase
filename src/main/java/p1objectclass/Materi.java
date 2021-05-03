package p1objectclass;

// Cara deklarasi class
// <modifier> class <identifier/nama> {
//    deklarasi atribut/field
//    deklarasi constructor
//    deklarasi method
// }

class Kucing {
    String warnaBulu;
    int berat;
    String jenis;

    public Kucing(String warnaBulu, int berat, String jenis) {
        this.warnaBulu = warnaBulu;
        this.berat = berat;
        this.jenis = jenis;
        System.out.println("HALO");
    }

    public Kucing() {}

    public void melompat() {
        System.out.println("Kucing melompat");
    }
}

public class Materi {
    public static void main(String[] args) {
        // Cara buat instansiasi
        Kucing kucing1 = new Kucing("Merah", 10, "Kampung");

        kucing1.warnaBulu = "Merah";

        System.out.println(kucing1.warnaBulu);

        kucing1.melompat();
    }
}
