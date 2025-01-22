import java.util.Scanner;

public class DtoO {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,i=0;
        int[] arr=new int[10];
        System.out.println("Enter Decimal:");
        num=input.nextInt();
        while (num>0) {
            arr[i]=num%8;
            i++;
            num=num/8;
        }
       System.out.println("octal Number is: ");
      for (int j = i-1; j>=0; j--) {
        System.out.print(arr[j]);
      }
     }
}
