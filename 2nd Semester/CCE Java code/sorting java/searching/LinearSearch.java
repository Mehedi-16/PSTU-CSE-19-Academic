public class linearsearch {
    public static void main(String[] args) {
        int num[]={10,12,13,14,15}, value=15, pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(value==num[i]){pos=i+1;break;}
        }
        System.out.println(pos==-1?"Not found":"Found at position "+pos);
       } 
    }

