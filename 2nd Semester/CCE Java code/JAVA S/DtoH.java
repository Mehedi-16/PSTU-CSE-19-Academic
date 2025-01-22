import java.util.Scanner;

public class DtoH {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the Number:");
        num=input.nextInt();
        int r;
        String s=" ";
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (num>0) {
            r=num%16;
            s=dig[r]+s; 
            num=num/16;
        }
        System.out.println("hexa is :"+s);
}
}