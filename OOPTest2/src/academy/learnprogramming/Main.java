package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("basic", "sausage", 3.66, "white");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        ////////

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentil", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        ////////

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();

        deluxeBurger.addHamburgerAddition3("Chicken", 3.56);
    }
}
