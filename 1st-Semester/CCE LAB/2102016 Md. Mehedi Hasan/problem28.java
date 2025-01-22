public class problem28 {
    public static void main(String[] args) {
        String myString = "Hello, World!";
        char[] charArray = myString.toCharArray();
        System.out.println("Original String: " + myString);
        System.out.print("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
