public class insertion {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,65,12};
        insertio(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
public static void insertio(int arr[])
{
for (int i = 1; i < arr.length; i++) 
{
    int temp=arr[i];
    int j=i-1;
    while (j>=0 && arr[j]>temp) 
    {
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=temp;
}




}


}
