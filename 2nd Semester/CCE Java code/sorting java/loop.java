public class loop {
    public static void main(String[] args) {
        int arr[]={4,5,6,-1,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j< arr.length; j++) {
                int temp=0;
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(" "+arr[i]);
        }
    }
}
