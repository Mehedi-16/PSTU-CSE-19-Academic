abstract class shape {
    abstract void rectanglearea(int length, int breadth);

    abstract void squarearea(int side);

    abstract void circlearea(int radius);

}

class rectangle extends shape {
    // int length, breadth;

    // rectangle(int length, int breadth) {
    // this.length = length;
    // this.breadth = breadth;
    // }

    void rectanglearea(int length, int breadth) {
        System.out.println(length * breadth);
    }

    void squarearea(int side) {
        System.out.println(side * side);
    }

    void circlearea(int radius) {
        System.out.println(Math.PI * radius * radius);
    }
}

public class problem6 {
    public static void main(String[] args) {
        shape a ;
        a= new rectangle();
        a.rectanglearea(4, 8);
        a.squarearea(5);
        a.circlearea(7);

    }
}
