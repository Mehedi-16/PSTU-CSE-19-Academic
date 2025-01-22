abstract class Parent {
    abstract void message();
}

class subclass1 extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class subclass2 extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class test1 {
    public static void main(String[] args) {
        Parent ms;
        ms = new subclass1();
        ms.message();
        ms = new subclass2();
        ms.message();
    }
}
