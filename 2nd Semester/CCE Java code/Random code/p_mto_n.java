public class p_mto_n {
    public static void main(String[] args) {
        int count=0,totalprime=0;
        int m=3,n=10;
        for (int i = m; i <=n; i++) {
            for (int j = 2; j <i; j++) {
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(i);
                totalprime++;
            }
            count=0;
        }
        System.out.println("total:"+totalprime);
    }
}
