abstract class Abstract {
    Abstract() {
        System.out.println("This is constructor of abstract class");
    }

    void non_Abstract_method() {
        System.out.println("This is a normal method of abstract class");
    }

    abstract void method();
}

class subclass extends Abstract {
    void method() {
        System.out.println("This is abstract method");
    }
}

public class problem4 {
    public static void main(String[] args) {
        Abstract ab;
        // ab=new Abstract();
        ab = new subclass();
        ab.non_Abstract_method();
        
        ab.method();
    }

}
