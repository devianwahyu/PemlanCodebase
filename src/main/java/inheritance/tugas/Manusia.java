package inheritance.tugas;

//  Spesifikasi
//  Kelas manusia merupakan kelas induk dengan definisi sebagai berikut:
//     − nama : String
//     − jenisKelamin : boolean (true : laki-laki, false : perempuan)
//     − nik : String
//     − menikah : boolean
//     + setter, getter
//     + getTunjangan() : double
//     + getPendapatan() : double
//     + toString() : String
//  (Keterangan)
//     o Tunjangan untuk yang telah menikah adalah apabila laki-laki akan mendapat $25
//       sedangkan perempuan mendapat $20.
//     o Tunjangan untuk yang belum menikah adalah $15 .
//     o toString() menampilkan nama, nik, jenis kelamin, dan jumlah pendapatan.

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin ? "laki-laki" : "perempuan";
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (isMenikah()) {
            return this.jenisKelamin ? 25 : 20;
        } else return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "nama : " + getNama() + "\n" +
                "jenis kelamin : "+ getJenisKelamin() + "\n" +
                "nik : " + getNik() + "\n" +
                "jumlah pendapatan : " + getPendapatan() + "\n";
    }
}
