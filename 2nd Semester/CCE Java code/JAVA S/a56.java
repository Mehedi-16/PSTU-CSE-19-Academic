import java.util.Scanner;

public class a56 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x=input.nextInt();
        System.out.println("Enter 2nd number: ");
        int y=input.nextInt();
        System.out.println("Divisore:  ");
        int p=input.nextInt();
        int count=0;

    for (int i = x; i <= y; i++) 
    {
        if (i%p==0) {
            count++;
        }
    }
    System.out.println(count);
    }
}
