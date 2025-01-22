public class problem19 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            char uppercaseChar = Character.toUpperCase(currentChar);
            int charIndex = uppercaseChar - 'A' + 1;
            System.out.println("Character: " + uppercaseChar + ", Index: " + charIndex);
        }
    }

}
