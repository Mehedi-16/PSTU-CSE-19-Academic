interface TVremote {
    void channel();
}
interface smart_TVremote extends TVremote {
    default void channel() {
        System.out.println("from TVremote into smart tv remote");
    }
}

class TV implements TVremote {
    public void channel() {
        System.out.println("from TVremote into TV");
    }
}

public class probelm8 {
    public static void main(String[] args) {

        TVremote t1;
        t1 = new smart_TVremote() {};
        t1.channel();
        t1 = new TV();
        t1.channel();
        
        


    }
}