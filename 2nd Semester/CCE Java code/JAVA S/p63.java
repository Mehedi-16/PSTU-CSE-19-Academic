import java.util.Scanner;

public class p63 {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the input:");
    int a=input.nextInt();
    int b=input.nextInt();
    if (a>b) {
        System.out.println(a);
    }
    if (b>a) {
        System.out.println(b); 
    }
    else if (a==b) 
    {
        System.out.println(0);
    }
    else if (a%6==b%6) {
        if (a>b) {
           System.out.println(b); 
        }
        else
        {
            System.out.println(a);
        }
    }
   } 
}
