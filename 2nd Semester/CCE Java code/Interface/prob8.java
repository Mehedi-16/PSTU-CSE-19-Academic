interface TVremote{
    void channel();
}
interface smartTVremote extends TVremote{
    default void channel()
    {
      System.out.println("smart tv remote");
    }
}
class TV implements TVremote{
    public void channel()
    {
     System.out.println("Tv");
    }
}

public class prob8 {
    public static void main(String[] args) {
        TVremote t1;
        t1=new smartTVremote(){};
        t1.channel();
        t1=new TV();
        t1.channel();
    }

}
