abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("$100");
    }

}

class BankB extends Bank {
    void getBalance() {
        System.out.println("$150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}

public class problem2 {
    public static void main(String[] args) {
        Bank bank;
        bank = new BankA();
        bank.getBalance();

        bank = new BankB();
        bank.getBalance();

        bank = new BankC();
        bank.getBalance();
    }
}
