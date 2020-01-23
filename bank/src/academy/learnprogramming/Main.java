package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount danAccount = new BankAccount();

        danAccount.setAccountNumber(123456789);
        danAccount.setBalance(0);
        danAccount.setCustomerName("John");
        danAccount.setCustomerEmail("john@mail.com");
        danAccount.setCustomerPhone("123-456-7890");

        danAccount.getAccountNumber();
        danAccount.getBalance();
        danAccount.getCustomerName();
        danAccount.getCustomerEmail();
        danAccount.getCustomerPhone();

        danAccount.depositFunds(1000);
        danAccount.withdrawFunds(100);
        danAccount.withdrawFunds(1000);
        danAccount.withdrawFunds(800);
        danAccount.withdrawFunds(200);

    }
}
