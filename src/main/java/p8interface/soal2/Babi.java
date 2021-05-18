package p8interface.soal2;

public class Babi extends Animal implements Mammals, Viviparous{
    public Babi(boolean isHeterotrophs, String name) {
        super(isHeterotrophs, name);
    }

    @Override
    void huntingFood() {
        System.out.println(super.name + " hunting food for life");
    }

    @Override
    void breathe() {
        System.out.println(super.name + " breathing with paru-paru");
    }

    @Override
    void reproduction() {
        System.out.println(super.name + " beranak singa");
    }

    @Override
    void move() {
        System.out.println(super.name + " running-running");
    }

    @Override
    public void breastfeeding() {
        System.out.println(super.name + " feeding it's children");
    }

    @Override
    public void beranak() {
        System.out.println(super.name + " berkembangbiak dengan melahirkan");
    }
}
