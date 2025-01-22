public class Binary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int data=11;
        System.out.println(binarySearch(arr,data));
    }
 public static int binarySearch(int arr[],int data) 
 {
    int l=0;
    int r=arr.length-1;
    int mid;
    while (l<=r) 
    {
        mid=(l+r)/2;
    if (data==arr[mid]) 
    {
        return mid;
    }
    else if (data>arr[mid]) 
    {
        l=mid+1;
    }
    else{
        r=mid-1;
    }
    
    }
    return -1;
 }
 
}
