abstract class ShapeA {
    abstract double RectangleArea(double length, double breadth);

    abstract double SquareArea(double s);

    abstract double CircleArea(double r);
}

class AreaA extends ShapeA {
    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double s) {
        return s * s;
    }

    @Override
    double CircleArea(double r) {
        return Math.PI * r * r;
    }
}

public class nuha {
    public static void main(String[] args) {
        AreaA area = new AreaA();
        double[] rectangleAreas = new double[4];
        double[] squareAreas = new double[4];
        double[] circleAreas = new double[5];

        for (int i = 0; i < 4; i++) {
            rectangleAreas[i] = area.RectangleArea(2.0 * (i + 1), 3 * (i + 1));
        }

        for (int i = 0; i < 4; i++) {
            squareAreas[i] = area.SquareArea(2.0 * (i + 1));
        }

        for (int i = 0; i < 5; i++) {
            circleAreas[i] = area.CircleArea(1.0 * (i + 1));
        }

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
