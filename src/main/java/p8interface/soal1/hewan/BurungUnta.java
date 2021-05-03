package p8interface.soal1.hewan;

import p8interface.soal1.kembangbiak.Ovipar;
import p8interface.soal1.vertebrata.Aves;

public class BurungUnta implements Aves, Ovipar {

    @Override
    public void bertelur() {
        System.out.println("Burung unta bertelur");
    }

    @Override
    public void terbang() {
        System.out.println("ternyata burung unta tidak terbang");
    }
}
