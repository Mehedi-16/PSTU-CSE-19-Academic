abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    void cats() {
        System.out.println("cats meow");
    }

    void dogs() {

    }
}

class Dogs extends Animals {
    void cats() {

    }

    void dogs() {
        System.out.println("dogs bark");
    }
}

public class problem5 {
    public static void main(String[] args) {
        Animals a;
        a = new Cats();
        a.cats();
        a = new Dogs();
        a.dogs();
    }
}
