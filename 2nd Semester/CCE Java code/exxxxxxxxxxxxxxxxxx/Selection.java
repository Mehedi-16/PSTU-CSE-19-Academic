public class Selection {
    public static void main(String[] args) {
        int arr[]={11,2,1,45,65};
        selection(arr);
        //printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }
   public static void selection(int arr[])
   {
    for (int i = 0; i < arr.length-1; i++) 
    {
        int min=i;
        for (int j = i+1; j < arr.length; j++) 
        {
            if (arr[min]>arr[j]) 
            {
                min=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
   }




}
