//Write a Java program to compare two strings lexicographically.

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "This is Exercise 1 ";
        String b = "This is Exercise 2";
        int count = a.compareTo(b);
        if (count < 0) {
            System.out.println("string a is less than string b");
        } else if (count == 0) {
            System.out.println("equals string");
        } else {
            System.out.println("string a is greater than string b");
        }
    }
}
