package p5constantstatic.soal4;

// Soal
//    Sebuah pabrik ponsel memproduksi berbagai macam merk Ponsel.
//    ponsel tersebut memiliki merk dan nomorSeri. Merk ponsel yang tersedia
//    di pabrik tersebut memiliki nilai yang tidak bisa diubah ubah.
//    Merk HP yang tersedia antara lain
//        - Nakio
//        - Sumsang
//        - Xaiomi
//        - Syno
//    Saat pembuatannya, Ponsel tersebut hanya meminta input merk saja
//    karena nomorSeri akan di berikan secara otomatis oleh sistem. Pemberian
//    nomorSeri memiliki format <angka><huruf> dan menganut sistem sebagai
//    berikut:
//        - HP pertama akan mendapat nomorSeri 1A
//        - HP setelahnya akan mendapat nomorSeri dengan urutan: 3B, 5C, 7D, ...
//        - jika huruf telah mencapai E, maka huruf akan kembali ke A
//    Ternyata, sebelum ponsel tersebut dijual, ponsel ponsel tersebut
//    dikirim terdahulu kepada seorang Agen yang dapat melakukan kegiatan proses
//    ponsel dengan memodifikasi nomorSeri tiap ponsel tersebut sehingga bisa di
//    jual. proses ponsel dilakukan dengan meminta inputan berupa array of
//    ponsel. Lalu pada tiap ponsel dilakukan penambahan nomorSeri dengan aturan:
//        - ponsel pertama akan mendapat tambahan angka 100 sehingga menjadi 1A100
//        - ponsel kedua akan mendapat tambahan angka 103 sehingga menjadi 3B103
//        - ponsel ketiga akan menjadi 5C106
//        - dan seterusnya
//    proses ponsel dapat dilakukan langsung tanpa harus melakukan pembuatan
//    objek agen.
//
//    Buatlah program yang sesuai dengan studi kasus di atas sehingga
//    menghasilkan output sesuai gambar pada lampiran

public class Soal {
    public static void main(String[] args) {
        HpPabrik hp1 = new HpPabrik(HpPabrik.NAKIO);
        HpPabrik hp2 = new HpPabrik(HpPabrik.SUMSANG);
        HpPabrik hp3 = new HpPabrik(HpPabrik.XAIOMI);
        HpPabrik hp4 = new HpPabrik(HpPabrik.SYNO);
        HpPabrik hp5 = new HpPabrik(HpPabrik.NAKIO);
        HpPabrik hp6 = new HpPabrik(HpPabrik.SYNO);

        HpPabrik[] hpPabriks = {hp1, hp2, hp3, hp4, hp5, hp6};

        HpAgen[] hpAgens = HpAgen.modifyCode(hpPabriks);
        for (HpAgen hpAgen: hpAgens) {
            hpAgen.getHpAgen();
        }
    }
}
