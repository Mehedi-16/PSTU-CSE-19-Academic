public class problem21 {
    public static void main(String[] args) {
        String mainString = "Hello, World! Hello, Java!";
        String substring = "Hello";
        int lastIndex = mainString.lastIndexOf(substring);
        if (lastIndex != -1) {
            System.out.println("Last index of '" + substring + "': " + lastIndex);
        } else {
            System.out.println("'" + substring + "' not found in the main string.");
        }
    }
}
