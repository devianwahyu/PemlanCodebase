package pertemuan2;

class Buku {
    // Attributes
    String judul;
    int harga;

    // Default Constructor
    public Buku() {}

    // Overload Constructors
    public Buku(String judul, int harga){
        this.judul = judul;
        this.harga = harga;
    }

    public Buku(String judul) {
        this.judul = judul;
    }

    public Buku(int harga) {
        this.harga = harga;
    }

    // Method/Behaviour
    public String detailBuku() {
        return "Judul: " + judul + "\nHarga: " + harga;
    }

}

public class Materi {
    public static void main(String[] args) {
        // Instance object from Buku class
        Buku buku = new Buku("Java Belajar", 100000);

        // Instance Method = cara kita panggil method dari class yg di instance
        System.out.println(buku.detailBuku());
    }
}
