package Day5;

public class BankAccount {
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    private double balance;

    public BankAccount(double initialBalance) {
        if(initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            balance = 0;
        }else{
            balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    //get
    public double getBalance()
    {
        return balance;
    }
}
