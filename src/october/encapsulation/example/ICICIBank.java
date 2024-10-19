package october.encapsulation.example;

public class ICICIBank {
    private String name;
    private int balance;

    public ICICIBank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance,boolean is_Admin) {
        if (is_Admin) {
            this.balance = balance;
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }
}
