import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && n != 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
