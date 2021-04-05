package bahas.soal2;

// Soal

// Seperti yang kita ketahui bahwa samsat akan membuat plat nomer kendaraan ketika 
// ada seseorang yang membeli kendaraan atau ganti plat karena masa aktif habis. 
// Anda diminta tolong untuk membuatkan program yang dapat membuat plat nomer 
// kendaraan dengan spesifikasi:

// 1. Daerah yang tersedia adalah Jakarta, Surabaya, Malang, dan Kediri
// 2. Jakarta memiliki kode depan B, Surabaya L, Malang N, dan Kediri AG
// 3. Angka di nomer plat terdiri atas 4 angka, yaitu antara 1000 sampai 9999
// 4. Diakhir nomer plat terdapat 3 karakter uppercase Alphabetic
// 5. Untuk poin 3 dan 4 dibuat secara random
// 6. Contoh untuk plat Jakarta B 2341 JKP

// Ketika ada orang yang akan membuat plat dia cukup memasukkan daerahnya saja. Contoh
// keluaran ada dibawah.

public class Soal {
    public static void main(String[] args) {

        GeneratePlat gp = new GeneratePlat(GeneratePlat.MALANG);

        GeneratePlat.getPlat(gp);

    }
}
