public class problem1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 30 / 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e);

        }
    }
}