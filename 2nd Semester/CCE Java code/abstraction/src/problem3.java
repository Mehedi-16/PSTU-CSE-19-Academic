
abstract class Mark {
    int physics, chemistry, math;

    Mark(int physics, int chemistry, int math) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;

    }

    abstract void getPercentage();
}

class A extends Mark {
    A(int physics, int chemistry, int math) {
        super(physics, chemistry, math);
    }

    void getPercentage() {
        double result;
        result = ((physics + chemistry + math) * 100)/300;

        System.out.println(result);

    }

}

class B extends Mark {
    int biology;

    B(int physics, int chemistry, int math, int biology) {
        super(physics, chemistry, math);
        this.biology = biology;
    }

    void getPercentage() {
        double result;
       result = ((physics + chemistry + math) * 100)/400;

        System.out.println(result);
    }
}

public class problem3 {
    public static void main(String[] args) {

        Mark mark;
        mark = new A(70, 80, 90);
        mark.getPercentage();
        mark = new B(70, 80, 90, 75);
        mark.getPercentage();

    }
}
