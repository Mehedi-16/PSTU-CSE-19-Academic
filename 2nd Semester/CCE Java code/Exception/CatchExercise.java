public class CatchExercise {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 5;
        }
         catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        } catch (Exception e3) {
            System.out.println(e3);
        }
        System.out.println("Rest of the code");
    }
}
