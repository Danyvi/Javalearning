package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        VipCustomer danAccount = new VipCustomer();

        System.out.println(danAccount.getName());
        System.out.println(danAccount.getCreditLimit());
        System.out.println(danAccount.getEmail());

        ///

        VipCustomer danteAccount = new VipCustomer("Dante", "dante@email.com");

        System.out.println(danteAccount.getName());
        System.out.println(danteAccount.getCreditLimit());
        System.out.println(danteAccount.getEmail());

        ///

        VipCustomer gaiaAccount = new VipCustomer("Gaia", 1000,"gaia@email.com");

        System.out.println(gaiaAccount.getName());
        System.out.println(gaiaAccount.getCreditLimit());
        System.out.println(gaiaAccount.getEmail());
    }
}
