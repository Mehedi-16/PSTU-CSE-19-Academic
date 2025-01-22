class p4 {
    private double length;
    private double breadth;

    public p4(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() 
    {
        return length * breadth;
    }

    public double calculatePerimeter() 
    {
        return 2 * (length + breadth);
    }
}

class Square extends p4 {
    public Square(double side) 
    {
        super(side, side);
    }
}

class Main {
    public static void main(String[] args) 
    {
        System.out.println();
        p4 rectangle = new p4(2,3);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        
        System.out.println();
        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
        System.out.println();
    }
}
