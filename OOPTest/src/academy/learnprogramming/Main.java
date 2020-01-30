package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("base", "white bread", "NY Strip",
				true, true, false, false);

		System.out.println("The base price for your hamburger is: " + hamburger.getHamburgerBasePrice());
		System.out.println("The price for your addons ("
				+ hamburger.getAddition1Name() + ", "
				+ hamburger.getAddition2Name() + ", "
				+ hamburger.getAddition3Name() + ", "
				+ hamburger.getAddition4Name() + ") is "
				+ hamburger.getAdditionsPrice());
		System.out.println("The total price for your hamburger is: " + hamburger.getHamburgerTotalPrice());
		System.out.println("\n");


		///////

		HealthyBurger healthyBurger = new HealthyBurger( true, true,
				true, true, true, true);

		System.out.println("The name of your burger is " + healthyBurger.getName());
		System.out.println("Your burger is using " + healthyBurger.getBreadRollType() + " bread");
		System.out.println("Your burger is using " + healthyBurger.getMeat() + " meat");

		System.out.println("\n");

		System.out.println("The price for your addons ("
				+ healthyBurger.getAddition1Name() + ", "
				+ healthyBurger.getAddition2Name() + ", "
				+ healthyBurger.getAddition3Name() + ", "
				+ healthyBurger.getAddition4Name() + ", "
				+ healthyBurger.getAddon1HealthyName() + ", "
				+ healthyBurger.getAddon2HealthyName() + ") is "
				+ healthyBurger.getAdditionsPrice());

		System.out.println("The total price for your " + healthyBurger.getName() + " is: " + healthyBurger.getHamburgerTotalPrice());

		///////







		}
}
