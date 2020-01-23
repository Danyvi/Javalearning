package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {



//        BankAccount danAccount = new BankAccount(123456789, 0, "John", "john@mail.com", "123-456-7890");
        BankAccount danAccount = new BankAccount();


        System.out.println(danAccount.getAccountNumber());
        System.out.println(danAccount.getBalance());
        System.out.println(danAccount.getCustomerName());
        System.out.println(danAccount.getCustomerEmail());
        System.out.println(danAccount.getCustomerPhone());

        danAccount.depositFunds(1000);
        danAccount.withdrawFunds(100);
        danAccount.withdrawFunds(1000);
        danAccount.withdrawFunds(800);
        danAccount.withdrawFunds(200);

    }
}
