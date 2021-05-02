package inheritance.tugas;

//   Kelas mahasiswa merupakan kelas turunan dari Manusia dengan definisi sebagai berikut:
//        − nim : String
//        − ipk : double
//        + setter, getter
//        + getStatus() : String
//        + getBeasiswa() : double
//        + toString() : String
//   (Keterangan)
//        o Beasiswa untuk ipk 3.0 – 3.5 mendapat $50 dan untuk 3.5 – 4 mendapat $75
//        o Status untuk mendapatkan angkatan dan prodi (menurut kaidah FILKOM UB)
//          1651506XXXXXXX
//        o Digit ke 1-2 adalah angkatan
//        o Digit ke 7 adalah prodi
//            ▪ 2 Teknik Informatika
//            ▪ 3 Teknik Komputer
//            ▪ 4 Sistem Informasi
//            ▪ 6 Pendidikan Teknologi Informasi
//            ▪ 7 Teknologi Informasi
//          Dengan pengembalian dengan format : prodi angkatan, contoh : Sistem
//          Informasi, 2017
//        o toString() menampilkan atribut induk + nim, ipk, dan status.

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = nim.charAt(0) + "" + nim.charAt(1);
        String jurusanCode = "" + nim.charAt(6);

        switch (jurusanCode) {
            case "2":
                return "Teknik Informatika, 20" + angkatan;
            case "3":
                return "Teknik Komputer, 20" + angkatan;
            case "4":
                return "Sistem Informasi, 20" + angkatan;
            case "6":
                return " Pendidikan Teknologi Informasi, 20" + angkatan;
            case "7":
                return "Teknologi Informasi, 20" + angkatan;
            default:
                return "404";
        }
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (ipk >= 3.0 && ipk < 3.5) {
            beasiswa = 50;
        } else if (ipk >= 3.5 && ipk <= 4) {
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() +
                "nim : " + getNim() + "\n" +
                "ipk : " + getIpk() + "\n" +
                "status: " + getStatus() + "\n";
    }
}
