package inheritance.tugas;

//    Kelas Pekerja merupakan kelas turunan dari Manusia dengan definisi sebagai berikut:
//        − gaji : double
//        − tahunMasuk : LocalDate
//        − jumlahAnak : int
//        + setter, getter
//        + getBonus() : double
//        + getGaji() : double
//        + toString() : String
//    (Keterangan)
//        o Bonus didapatkan oleh pegawai sesuai lama bekerja :
//        o Jika lama bekerja 0 – 5 tahun, maka bonus sebesar 5% dari gaji
//        o Jika lama bekerja 5 – 10 tahun, maka bonus sebesar 10% dari gaji
//        o Jika lebih dari 10 tahun, maka bonus sebesar 15% dari gaji
//        o Tunjangan ditambah apabila memiliki anak, yaitu $20 per anak.
//        o toString() menampilkan atribut induk + tahun masuk, jumlah anak, dan gaji.

import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int totalLamaKerja = tahunMasuk.getYear() - LocalDate.now().getYear();
        int lamaKerja = Math.abs(totalLamaKerja);
        double bonus = 0;

        if (lamaKerja >= 0 && lamaKerja < 5) {
            bonus = 0.05 * gaji;
        } else if (lamaKerja >= 5 && lamaKerja <= 10) {
            bonus = 0.1 * gaji;
        } else if (lamaKerja > 10) {
            bonus = 0.15 * gaji;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (20 * jumlahAnak);
    }

    @Override
    public double getPendapatan() {
        return getTunjangan() + getBonus() + gaji;
    }

    @Override
    public String toString() {
        return super.toString() +
                "gaji : " + gaji + "\n" +
                "tahun masuk : " + tahunMasuk + "\n" +
                "jumlah anak : " + jumlahAnak + "\n";
    }
}
