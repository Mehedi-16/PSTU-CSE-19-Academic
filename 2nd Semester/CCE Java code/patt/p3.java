import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i <n; i++) 
        {
            for (int j = 0; j <n-i; j++) 
        {
            System.out.print(" ");
        } 
        for (int j = 0; j <2*i-1; j++) 
        {
         System.out.printf("%c",i+64);
        }
        System.out.println();
    }
    for (int i =n-2; i>0; i--) 
    {
        for (int j = 0; j <n-i; j++) 
    {
        System.out.print(" ");
    } 
    for (int j = 0; j <2*i-1; j++) 
    {
     System.out.printf("%c",i+64);
    }
    System.out.println();
}




}
}
