import java.util.Scanner;

public class p65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = input.nextInt();
        int b = input.nextInt();
    
         int result=a/b;
         int f=result-b;
         System.out.println(Math.abs(f));
    
    
    }
}