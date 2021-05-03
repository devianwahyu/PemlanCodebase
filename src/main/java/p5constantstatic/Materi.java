package p5constantstatic;

class User {
    private static int idGenerate = 1;

    private final int ID;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = idGenerate;
        idGenerate++;
    }

    public static int getIdGenerate() {
        return idGenerate;
    }

    public static void setIdGenerate(int idGenerate) {
        User.idGenerate = idGenerate;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getUser(User user) {
        System.out.println(user.getID() + " " + user.getName() + " " + user.getAge());
    }

    public void get() {
        getIdGenerate();
    }
}

public class Materi {
    public static void main(String[] args) {

        // Konstanta mirip variabel tapi nilainya tetap
        // deklarasi: modifier final data_type IDENTIFIER
//        final int JUMLAH_HARI_SETAHUN = 365;
//        JUMLAH_HARI_SETAHUN = 20;

        User user = new User("Dedik Kurniawan", 70);
        User.getUser(user);

    }
}
