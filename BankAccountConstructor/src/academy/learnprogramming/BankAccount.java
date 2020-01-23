package academy.learnprogramming;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public BankAccount() {
        this(999999999, 0, "Default name", "Default email", "Default email");
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {

        System.out.println("BankAccount Constructor with parameters called!");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    // GETTERS

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    // SETTERS

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    ///// ADDITIONAL METHODS /////

    public void depositFunds(double fundsDeposited) {
        this.balance += fundsDeposited;
        System.out.println("Deposit of " + fundsDeposited  + " made. Your new balance is: " + this.balance);
    }

    public void withdrawFunds(double fundsWithdrawl) {
        if ((this.balance - fundsWithdrawl) < 0) {
            System.out.println("You can not withdrawl " + fundsWithdrawl + ". Your Balance is : " + this.balance);
        } else {
            this.balance -= fundsWithdrawl;
            System.out.println("Withdrawl of " + fundsWithdrawl + " processed. Your new balance is: " + this.balance);
        }
    }
}
