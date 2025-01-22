import java.util.Scanner;

public class DtoB {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,i=0;
        int[] arr=new int[10];
        System.out.println("Enter Decimal:");
        num=input.nextInt();
        while (num>0) {
            arr[i]=num%2;
            i++;
            num=num/2;
        }
       System.out.println("Binary Number is: ");
      for (int j = i-1; j>=0; j--) {
        System.out.print(arr[j]);
      }
     }
}
