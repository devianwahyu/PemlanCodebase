package p6inheritance.tugas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Test class Manusia
        Manusia manusia1 = new Manusia("A", true, "111", true);
        System.out.println(manusia1);

        // Test class Mahasiswa
        MahasiswaFILKOM b = new MahasiswaFILKOM("B", false, "111", false, "165150300111100", 4);
        System.out.println(b);

        // Test class Pekerja
        Pekerja c = new Pekerja(1000, LocalDate.of(2016, 1, 1),
                3, "C", true, "111", true);
        System.out.println(c);

        // Test class Manager
        Manager d = new Manager("HRD", 1000,
                LocalDate.of(2016, 1, 1), 3, "D", true, "111", true);
        System.out.println(d);

    }
}
