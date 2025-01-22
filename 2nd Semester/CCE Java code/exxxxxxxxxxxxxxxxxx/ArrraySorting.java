
import java.util.Arrays;
import java.util.Scanner;

class ArrraySorting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num[]= new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(""+num[i]);
        }
    }

}