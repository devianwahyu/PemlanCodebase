package p8interface.soal1.hewan;

import p8interface.soal1.kembangbiak.Ovipar;
import p8interface.soal1.vertebrata.Pisces;

public class Salmon implements Pisces, Ovipar {

    @Override
    public void bertelur() {
        System.out.println("Ikan bertelur ayam");
    }

    @Override
    public void berenang() {
        System.out.println("Ikan berenang di laut");
    }
}
