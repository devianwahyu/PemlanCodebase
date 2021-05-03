package p8interface.soal1;

/*

Hewan Vertebrata
- interface Mammals: method menyusui()
- interface Aves: method terbang()
- interface Pisces: method berenang()

Cara kembang biak
- interface Vivipar: method beranak()
- interface Ovipar: method bertelur()
- interface Ovovivipar: method bertelur(), beranak()

Hewan
- Sapi
- Salmon
- Burung unta

 */

import p8interface.soal1.hewan.Salmon;
import p8interface.soal1.hewan.Sapi;

public class Main {
    public static void main(String[] args) {
        Sapi sapi = new Sapi();
        sapi.beranak();
        sapi.menyusui();

        Salmon salmon = new Salmon();
        salmon.berenang();
        salmon.bertelur();
    }
}
