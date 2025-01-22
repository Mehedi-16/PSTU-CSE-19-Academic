public class problem23 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";
        boolean match = str1.regionMatches(true, 7, str2, 0, str2.length());
        if (match) {
            System.out.println("The region in str1 matches the region in str2.");
        } else {
            System.out.println("The region in str1 does not match the region in str2.");
        }
    }
}
