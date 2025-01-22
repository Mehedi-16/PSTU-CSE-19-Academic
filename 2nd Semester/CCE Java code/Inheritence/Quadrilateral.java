public class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    public Quadrilateral(Point point1,Point point2,Point point3,Point point4)
    {
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
        this.point4=point4;
    }
   public Point getPoint1()
   {
    return point1;
   }
   public Point getPoint2()
   {
    return point2;
   }
   public Point getPoint3()
   {
    return point3;
   }
   public Point getPoint4()
   {
    return point4;
   }

   public double A()
   {
    return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
   }
   public double B()
   {
    return Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
   }
   public double C()
   {
    return Math.sqrt(Math.pow(point4.getX() - point3.getX(), 2) + Math.pow(point4.getY() - point3.getY(), 2));
   }
   public double D()
   {
    return Math.sqrt(Math.pow(point1.getX() - point4.getX(), 2) + Math.pow(point1.getY() - point4.getY(), 2));
   }
}
