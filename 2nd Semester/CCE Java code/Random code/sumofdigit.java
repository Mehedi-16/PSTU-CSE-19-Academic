public class sumofdigit {
    public static void main(String[] args) {
         int num=6543,sum=0;
         int temp=num;
         while (temp!=0) {
            int rem=temp%10;
             sum=sum*10+rem;
             temp=temp/10;
         }
         System.out.println("sum :"+sum);
    }
}
