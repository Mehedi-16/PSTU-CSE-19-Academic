import java.io.IOException;

public class problem5 {
    public static void main(String[] args) {
        try {
            
            throw new IOException("Simulating an IOException");
        } catch (IOException e) {
           
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
