import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b1,b2,i=0;
        int[] arr=new int[10];
        int carry=0;
        System.out.println("Enter the first Binary:");
        b1=input.nextInt();
        System.out.println("Enter the 2nd Binary:");
        b2=input.nextInt();
        while (b1 !=0 || b2!=0) {
            arr[i]=((b1%10+b2%10+carry)%2);
            carry=((b1%10+b2%10+carry)/2);
            b1=b1/10;
            b2=b2/10;
            i++;
        }
        if (carry !=0) {
            arr[i]=carry;
            i++;
        }
        i--;
        System.out.println("Result:");
        while(i>=0) {
           System.out.print(" "+arr[i]); 
           i--;
        }

    }
}