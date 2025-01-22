import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int first=0,second=1,fibo,count=0,n;
        n=input.nextInt();
       while (count<n) 
       {
        if (count<=1) 
        {
           fibo=count; 
        }
        else
        {
         fibo=first+second;
         first=second;
         second=fibo;
        }
        System.out.print(" "+fibo);
        count++;
       }
    }
}
