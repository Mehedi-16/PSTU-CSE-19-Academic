class threading extends Thread{
    int n;
    public threading(int n)
    {
        this.n=n;
    }
    public void run()
    {
        for (int i = 0; i < n; i++) {
            
        }
        System.out.println("with threding :"+n);
    }
}


public class p_one {
    public static void loop(int n)
    {
     for (int i = 0; i < n; i++) 
     {
        
     }
      System.out.println("without threding: "+n);
    }
    public static void main(String[] args) {
        loop(1000);
        loop(100);
        loop(10);
        loop(1);
        System.out.println();
    threading a=new threading(1000);
    threading b=new threading(100);
    threading c=new threading(10);
    threading d=new threading(1);

      a.start();
      b.start();
      c.start();
      d.start();

        }
}
