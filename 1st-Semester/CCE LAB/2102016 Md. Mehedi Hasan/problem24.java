public class problem24 {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char charToReplace = ',';
        char replacementChar = '-';
        String modifiedString = originalString.replace(charToReplace, replacementChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
