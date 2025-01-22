import java.util.Arrays;

public class S {
    public static void main(String[] args) {
        int[] number={12,-3,21,34,56};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);
        }
          System.out.println();
        for (int i =number.length-1; i>=0; i--) {
            System.out.print(" "+number[i]);
        }
    }
}
