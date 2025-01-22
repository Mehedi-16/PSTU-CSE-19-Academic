class Shape {
public void draw_shape() {
System.out.println("This is Shape");
}
}
class Rectangle extends Shape {
public void draw_rectangle() {
System.out.println("This is Rectangluar shape");
}
}
class Circle extends Shape {
public void draw_circle() {
System.out.println("This is Circular shape");
     }
  }
class Square1 extends Rectangle {
     public void draw_square() {
          System.out.println("Square is a rectangle");
      }
    }
  
  public class p6 {
      public static void main(String[] args) {
         Square1 square = new Square1();
         square.draw_shape();
                  square.draw_rectangle();
                  Circle c1=new Circle();
                  c1.draw_circle();
      }
  }

