package p8interface.soal2;

public abstract class Animal extends Organism {
    private final boolean isHeterotrophs;

    public Animal(boolean isHeterotrophs, String name) {
        super(name);
        this.isHeterotrophs = isHeterotrophs;
    }

    public boolean isHeterotrophs() {
        return isHeterotrophs;
    }

    abstract void huntingFood();
}
