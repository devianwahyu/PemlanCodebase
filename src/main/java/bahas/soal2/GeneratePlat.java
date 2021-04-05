package bahas.soal2;

import java.util.Random;

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

public class GeneratePlat {

    // Available regions
    public static final String JAKARTA = "Jakarta";
    public static final String SURABAYA = "Surabaya";
    public static final String MALANG = "Malang";
    public static final String KEDIRI = "Kediri";

    // Plat attributes
    private final String region;
    private final String platNumber;

    // Object for generate random number
    private Random random = new Random();

    // Constructor
    public GeneratePlat(String region) {
        this.region = region;

        String regionCode = generateRegionCode(region);
        int randomNumber = generateRandomNumbers();
        String randomChar = generateRandomChar();

        this.platNumber = regionCode + " " + randomNumber + " " + randomChar;
    }

    // Method to generate regionCode
    private String generateRegionCode(String region) {
        String generatedCode = "";
        switch (region) {
        case JAKARTA:
            generatedCode = "B";
            break;
        case SURABAYA:
            generatedCode = "L";
            break;
        case MALANG:
            generatedCode = "N";
            break;
        case KEDIRI:
            generatedCode = "AG";
            break;
        default:
            generatedCode = "";
            break;
        }
        return generatedCode;
    }

    // Method to generate 4 digit random numbers
    private int generateRandomNumbers() {
        return random.nextInt(9999) + 1000;
    }

    // Method to generate 3 random alphabetic characters
    private String generateRandomChar() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = 3;
        String result = "";
        // char[] arrResult = new char[3];

        // Generate 3 characters
        for (int i = 0; i < length; i++) {
            // arrResult[i] = characters.charAt(random.nextInt(characters.length()));
            result += characters.charAt(random.nextInt(characters.length()));
        }

        return result;
    }

    // Show plat
    public static void getPlat(GeneratePlat gp) {
        System.out.print("\nRegion: " + gp.region + "\nPlat: " + gp.platNumber + "\n");
    }

}
