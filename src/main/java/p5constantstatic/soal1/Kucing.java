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

public class Kucing {
    private static int AWAL_ID = 1000;

    private final String ras;
    private final int noKalung;

    public Kucing(String ras) {
        this.ras = ras;
        this.noKalung = AWAL_ID;
        AWAL_ID += 5;
    }

    public String getRas() {
        return ras;
    }

    public int getNoKalung() {
        return noKalung;
    }

    public static void getKucing(Kucing kucing) {
        System.out.printf("Ras: %s\nID: %d\n\n", kucing.getRas(), kucing.getNoKalung());
    }

    public static void tes() {}
}
