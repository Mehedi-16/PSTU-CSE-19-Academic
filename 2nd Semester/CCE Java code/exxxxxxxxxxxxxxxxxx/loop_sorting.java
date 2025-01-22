import java.util.Scanner;

public class loop_sorting {
   public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the arr number:");
    int n=input.nextInt();
    int arr[]=new int[n];
   for (int i = 0; i < n; i++) {
    arr[i]=input.nextInt();
   }


    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) 
        {
            int temp;
            if (arr[j]<arr[i]) 
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(""+arr[i]);
    }
   } 
}
