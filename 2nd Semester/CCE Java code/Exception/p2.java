import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            int a=input.nextInt();
            //double b=Math.sqrt(a);
            if (a>0) 
            {
                System.out.println(Math.sqrt(a));
            }
            else if(a<0)
            {
               throw new ArithmeticException();
            }
        } 
        catch (ArithmeticException e1)
        {
            System.out.println("Can convert");
        }
        catch (Exception e) {
            System.out.println("invalid");
        }
    }
}
