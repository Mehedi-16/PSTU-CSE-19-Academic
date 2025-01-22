public class Area extends Shape{
   void RectangleArea(int length,int breadth)
    {
        System.out.println("RectangleArea:"+length * breadth);
    }
    void SquareArea(int side)
    {
        System.out.println("Squre: "+side*side);
    }
    void CircleArea(int radius)
    {
        System.out.println("Circle: "+3.15*radius*radius);
    }
}
