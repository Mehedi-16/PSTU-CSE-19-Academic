class SomeClass {
    public SomeClass() 
    throws Exception {
        throw new Exception("Constructor of SomeClass has failed");
    }
}

public class problem6 {
    public static void main(String[] args) {
        try {
            SomeClass someObject = new SomeClass(); 

        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
