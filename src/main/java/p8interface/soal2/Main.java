package p8interface.soal2;

/*

class Organism
    attributes:
        1. name: String
    methods:
        0. Construct(name)
        1. *breathe()
        2. *reproduction()
        3. *move()
        4. grow(): void -> print "this.name grows up"
        5. eat(): void -> print "this.name eating food"
        7. excretion(): void -> print "this.name bab"
        8. getter

class Animal inherit Organism
    attributes:
        1. isHeterotrophs: Boolean
    methods:
        0. Constructor(isHeterotrophs, name)
        1. *huntingFood()

class Mammals
    method:
        0. *breastfeeding();

class Viviparous
    method:
        0. *beranak();

class AnimalName(bebas, bisa Trenggiling, Tapi, dll) inherit Animal, Mammals, and Viviparous
    ketika implement method boleh menampilkan string bebas yang relevan dengan methodnya;

NOTE:
    yang ada tanda (*) adalah abstract


*/

public class Main {
    public static void main(String[] args) {
        Babi babi = new Babi(true, "Tapir");
        babi.breathe();
        babi.reproduction();
        babi.move();
        babi.grow();
        babi.eat();
        babi.excretion();
        babi.huntingFood();
        babi.breastfeeding();
        babi.beranak();
    }
}
