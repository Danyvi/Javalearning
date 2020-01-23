package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 0, "email@email.com");
        System.out.println("Empty Constructor called");
    }

    public VipCustomer(String name, String email) {

        this(name, 0, email);

        System.out.println("Constructor with 2 parameters called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println("Constructor with 3 parameters called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
