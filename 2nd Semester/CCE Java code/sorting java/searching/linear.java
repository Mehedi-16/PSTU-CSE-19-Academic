public class linear {
   public static void main(String[] args) {
    int num[]={10,12,13,14,15};
    int value=15,pos=-1;
    for (int i = 0; i < num.length; i++) {
        if(value==num[i])
        {
        pos=i+1;
        break;
        }
    }
    if(pos==-1)
    {
        System.out.println("Not found");
    }
   } 
}
