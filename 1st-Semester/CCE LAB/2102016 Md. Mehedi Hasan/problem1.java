import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {
            char characterAtIndex = inputString.charAt(index);
            System.out.println("Original String = " + inputString);
            System.out.println("The character at position " + index + " is " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the range of the string.");
        }
    }
}
