package p8interface.soal1.hewan;

import p8interface.soal1.kembangbiak.Vivipar;
import p8interface.soal1.vertebrata.Mammals;

public class Sapi implements Mammals, Vivipar {

    @Override
    public void beranak() {
        System.out.println("Sapi beranak 15");
    }

    @Override
    public void menyusui() {
        System.out.println("15 anak sapi disusui");
    }
}
