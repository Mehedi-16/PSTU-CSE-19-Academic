public class problem_seven {
    public static void main(String[] args) {
        Point point1=new Point(0, 1);
        Point point2=new Point(0, 1);
        Point point3=new Point(0, 1);
        Point point4=new Point(0, 1);
        Trapezoid t1=new Trapezoid(point1, point2, point3, point4);
        System.out.println(t1.Area());
    }
}
