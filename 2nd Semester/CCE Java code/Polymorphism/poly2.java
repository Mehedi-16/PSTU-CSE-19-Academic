
class superclass {
    int data1;
   public int Data1()
   {
    return data1;
   }
    
}

class subclass extends superclass {
    int data2;

    subclass(int data1, int data2) {
        this.data1=data1;
        this.data2 = data2;
    }


    void CheckCondition() {
        if (Data1() == 10 && data2 == 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

public class poly2 {
    public static void main(String[] args) {
subclass obj=new subclass(10, 15);

obj.CheckCondition();

subclass obj2=new subclass(100, 150);
obj2.CheckCondition();
    }
}
