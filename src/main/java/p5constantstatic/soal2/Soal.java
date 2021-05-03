package p5constantstatic.soal2;

// Soal
//    Suatu kampus bernama BU berniat untuk membuat program pendata mahasiswa baru.
//    mahasiswa yang akan di daftarkan akan memiliki nim, nama, dan umur.
//    pada saat pembuatannya, hanya nama dan umur saja yang diberikan karena nim akan
//    di buatkan otomatis oleh sistem dan nim setiap siswa berbeda satu sama lain.
//    penentuan nim dilakukan dengan aturan:
//	    a. nim pertama bernilai 29032020101
//	    b. nim kedua bernilai 29032020105
//	    c. nim ketiga bernilai 29032020109
//      d. dst
//    Kampus tersebut dapat melakukan cetakDataMahasiswa dengan menginputkan mahasiswa,
//    dan akan mengeluarkan output berupa data diri mahasiswa tersebut.

public class Soal {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Hendri Satria", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("Yusuf", 21);

        Mahasiswa.getMahasiswa(mahasiswa1);
        Mahasiswa.getMahasiswa(mahasiswa2);
    }
}
