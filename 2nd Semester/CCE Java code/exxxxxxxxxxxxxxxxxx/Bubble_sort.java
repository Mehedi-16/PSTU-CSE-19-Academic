public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={1,2,3,10,4,23};
        bubble(arr);
        
        System.out.println("sorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void bubble(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

   
}
