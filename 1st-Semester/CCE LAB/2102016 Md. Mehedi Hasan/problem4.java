//Write a Java program to count Unicode code points in the specified text range of a string.

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        String arr = "w3rsource.com";
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = arr.codePointCount(a, b);
        System.out.println(count);

    }
}
