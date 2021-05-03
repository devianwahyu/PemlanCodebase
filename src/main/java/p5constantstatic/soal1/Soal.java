package p5constantstatic.soal1;

// Soal 1
//    Terdapat sebuah rumah adopsi kucing. Tempat ini akan menerima kucing liar apapun
//    yang sebatangkara agar dapat di adopsi oleh orang yang menginginkannya. Rumah
//    tersebut memiliki sistem pemberian identitas kepada kucing yang masuk kesana
//    berupa angka yang akan dicetak pada kalung kucing tersebut. Saat masuk ke rumah itu,
//    kucing liar akan diidentifikasi terlebih dahulu rasnya, baru diberi nomor identitas.
//    Nomor identitas memiliki aturan:
//        - Kucing pertama akan mendapat angka 1000
//        - Kucing selanjutnya akan mendapat angka 1005, 1010, 1015, dan seterusnya
//        - Nomer identitas di generate oleh sistem, sehingga pemilik rumah adopsi tidak
//        perlu memberikan secara manual
//    Buatlah program untuk membantu rumah adopsi itu menentukan nomor identitas kucing

// Class Kucing
// Ras, ID
// ID 1000 loncat 5

public class Soal {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Persia");
        Kucing kucing2 = new Kucing("Anggora");
        Kucing kucing3 = new Kucing("Spinx");

        Kucing.getKucing(kucing1);
        Kucing.getKucing(kucing2);
        Kucing.getKucing(kucing3);

        // Beda antara static dan non-static adalah pemanggilannya
        Kucing.tes();
    }
}
