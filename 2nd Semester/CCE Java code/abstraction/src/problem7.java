abstract class Shape {
    abstract double RectangleArea(double length, double breadth);

    abstract double SquareArea(double side);

    abstract double CircleArea(double radius);
}

class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double SquareArea(double side) {
        return side * side;
    }

    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class problem7 {
    public static void main(String[] args) {

        Area areaCalculator = new Area();
        double[] rectangleAreas = new double[4];
        double[] squareAreas = new double[4];
        double[] circleAreas = new double[5];
        // input
        for (int i = 0; i < 4; i++) {
            rectangleAreas[i] = areaCalculator.RectangleArea(2.0 * (i + 1), 3.0 * (i + 1));
            squareAreas[i] = areaCalculator.SquareArea(2.0 * (i + 1));
        }

        for (int i = 0; i < 5; i++) {
            circleAreas[i] = areaCalculator.CircleArea(2.0 * (i + 1));
        }
        // output
        for (int i = 0; i < 4; i++) {
            System.out.println("Area of Rectangle " + (i + 1) + ": " + rectangleAreas[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Area of Square " + (i + 1) + ": " + squareAreas[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Area of Circle " + (i + 1) + ": " + circleAreas[i]);
        }
    }
}
