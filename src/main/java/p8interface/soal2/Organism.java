package p8interface.soal2;

public abstract class Organism {

    public String name;

    public Organism(String name) {
        this.name = name;
    }

    abstract void breathe();

    abstract void reproduction();

    abstract void move();

    public void grow() {
        System.out.println(this.name + " grows up");
    }

    public void eat() {
        System.out.println(this.name + " eating food");
    }

    public void excretion() {
        System.out.println(this.name + " bab");
    }

    public String getName() {
        return name;
    }
}
