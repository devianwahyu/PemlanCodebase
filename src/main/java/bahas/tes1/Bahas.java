package bahas.tes1;

abstract class A {
    int a() {
        return 10;
    }

    abstract int b();
}

public class Bahas extends A{

    @Override
    int a() {
        return super.a() * 2;
    }

    @Override
    int b() {
        return 0;
    }

}
