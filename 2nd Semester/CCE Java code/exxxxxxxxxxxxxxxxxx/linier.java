public class linier {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int value=5;
        int pos=-1;
        for (int i = 0; i < arr.length; i++)
         {
            if (value==arr[i]) 
            {
                pos=i+1;
                break;
            }
        }
        if (pos==-1) 
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found at position: "+pos);
        }
    }
}
