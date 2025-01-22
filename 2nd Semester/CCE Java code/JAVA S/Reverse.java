import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str1=input.nextLine();
        String str2=" ";
        int len=str1.length();
    
        System.out.print("Reverse string: ");
        for (int i = len - 1; i >= 0; i--) {
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);
    }
}
