import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your Number: ");
    int n=input.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) 
        {
            System.out.print(" ");
        }
        for (int j = 1; j <=2*i-1; j++) 
        {
            System.out.printf("%c",j+64);
        }

        System.out.println();
    }
  for (int i = n-1; i>= 1; i--) {
    for (int j = 1; j <= n-i; j++) 
        {
            System.out.print(" ");
        }
        for (int j = 1; j <=2*i-1; j++)
        {
        System.out.printf("%c",j+64);
    }
    System.out.println();
  }



}
}
