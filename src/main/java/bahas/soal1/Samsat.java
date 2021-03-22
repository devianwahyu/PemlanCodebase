package bahas.soal1;

import java.util.ArrayList;

public class Samsat {
    private ArrayList<STNK> listSTNK = new ArrayList<>();

    public Samsat() {}

    public void createSTNK(Person owner, Car car, String nopol) {
        listSTNK.add(new STNK(nopol, car, owner));
    }

    public void printAllInfoStnk() {
        for (STNK stnk: listSTNK) {
            stnk.getInfo();
        }
    }

    public int getJumlahStnk() {
        return listSTNK.size();
    }
}
