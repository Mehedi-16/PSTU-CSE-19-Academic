public class Pattern1 {

    public static void main(String[] args) {
        int i, j;
        int n = 5;
       for(i=0;i<=n;i++)
       {
           for(j=0;j<=n-i;j++)
           {
               System.out.print(" ");
           }
           int value=1;
           for(j=1;j<=i;j++)
           {
            System.out.print(" "+value);
               value=value*(i-j)/j; 
              
           }
           System.out.println();
       }
     
    }
}