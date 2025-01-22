import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inpuy: ");
        try {
            double a = input.nextDouble();
            double b = Math.sqrt(a);
            if (a > 0) {
                System.out.println("result " + b);
            } else if (a < 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("cant convert");
        } catch (Exception e) {
            System.out.println("ivalid input");
        }
    }
}