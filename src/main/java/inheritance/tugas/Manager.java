package inheritance.tugas;

//    Kelas Manager merupakan kelas turunan dari Pekerja dengan definisi sebagai berikut:
//        − departemen : String
//        + setter, getter
//    (Keterangan)
//        o Tunjangan ditambah sebesar 10% dari gaji.
//        o toString() menampilkan atribut induk + departemen

import java.time.LocalDate;

public class Manager extends Pekerja{

    private String departement;

    public Manager(String departement, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah);
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (0.1 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() +
                "departement : '" + departement + "\n";
    }
}
