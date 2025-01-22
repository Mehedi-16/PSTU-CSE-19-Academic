import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=input.nextLine();
        int lc=0,nc=0,sc=0,oc=0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch=str.charAt(i);
            
        if (Character.isLetter(ch))
        {
            lc++;
        }
        else if (Character.isDigit(ch))
        {
            nc++;
        }
        else if (Character.isSpace(ch))
        {
            sc++;
        }
        else{
            oc++;
        }
        }
        System.out.println(lc);
        System.out.println(nc);
        System.out.println(sc);
        System.out.println(oc);
    }
}

