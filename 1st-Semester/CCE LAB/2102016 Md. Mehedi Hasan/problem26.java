public class problem26 {
    public static void main(String[] args) {

        String mainString = "Hello, World!";
        String prefix = "Hello";
        boolean startsWith = mainString.startsWith(prefix);
        if (startsWith) {
            System.out.println("The string starts with '" + prefix + "'.");
        } else {
            System.out.println("The string does not start with '" + prefix + "'.");
        }
    }
}
