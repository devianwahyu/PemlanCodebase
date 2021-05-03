package p5constantstatic.soal3;

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

public class Soal {
    public static void main(String[] args) {
        Baju[] bajus = Baju.buatBanyakBaju(10000, 5, Baju.MERK_DENIM);
        for (Baju baju: bajus) {
            System.out.println(baju.getMerk());
            System.out.println(baju.getHarga());
        }
    }
}
