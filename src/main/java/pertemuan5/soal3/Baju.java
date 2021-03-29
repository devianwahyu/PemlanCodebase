package pertemuan5.soal3;

// Soal
//    Sebuah toko baju menjual baju berbagai merk branded. Toko tersebut menyediakan
//    merk:
// 	    - Denim
// 	    - Levis
// 	    - Jubah
// 	    - Koko
//    Setiap baju memiliki harga dan merk baju. Lalu toko tersebut dapat melakukan
//    suatu aktivitas buatBanyakBaju yang menghasilkan kumpulan baju dengan merk
//    sama namun dengan harga yang berselisih 10000. buatBanyakBaju dapat dipanggil
//    tanpa harus membuat objek baju terlebih dahulu dan menerima inputan berupa
//    hargaAwal, jumlahBaju, dan merkBaju

public class Baju {
    public static final String MERK_DENIM = "Denim";
    public static final String MERK_LEVIS = "Levis";
    public static final String MERK_JUBAH = "Jubah";
    public static final String MERK_KOKO = "Koko";

    private String merk;
    private int harga;

    public Baju(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }

    public static Baju[] buatBanyakBaju(
            int hargaAwal,
            int jumlahBaju,
            String merkBaju
    ) {
        Baju[] baju = new Baju[jumlahBaju];
        int hargaBaju = hargaAwal;
        for (int i = 0; i < baju.length; i++) {
            baju[i] = new Baju(merkBaju, hargaBaju);
            hargaBaju += 10000;
        }

        System.out.println("Harga awal baju: " + hargaAwal);
        System.out.println("Harga akhir baju: " + hargaBaju);
        return baju;
    }
}
