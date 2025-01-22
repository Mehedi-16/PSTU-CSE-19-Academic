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
        TVremote tv;
        tv = new smart_TVremote() {};
        tv.channel();
        tv = new TV();
        tv.channel();
        


    }
}
