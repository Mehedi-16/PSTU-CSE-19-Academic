import java.util.Scanner;

public class p64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a < 25 || b > 75) {
            System.out.println("False");
        } else {
            int p = a % 10;
            int q = b % 10;
            a = a / 10;
            b = b / 10;
            
            if (p == q || a == b || a == q || p == b) {
                System.out.println("true");
            } else {
                System.out.println("False");
            }
        }
    }
}
