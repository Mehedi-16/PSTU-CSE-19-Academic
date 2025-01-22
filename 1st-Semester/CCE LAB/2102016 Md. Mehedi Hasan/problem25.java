public class problem25 {
    public static void main(String[] args) {
        String originalString = "Java is a programming language. Java is fun. Java is powerful.";
        String regex = "Java";
        String replacement = "Python";
        String modifiedString = originalString.replaceAll(regex, replacement);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
