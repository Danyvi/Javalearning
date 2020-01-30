package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{

    private String addon1DeluxeName = "Chips";
    private String addon2DeluxeName = "Drink";
    private boolean isAddon1Deluxe = true;
    private boolean isAddon2Deluxe = true;
    private double addon1DeluxePrice = 3.0;
    private double addon2DeluxePrice = 3.5;
    private double addonsDeluxePrice = 6.5;

    public DeluxeBurger(String breadRollType, String meat) {
        super("Deluxe Burger", breadRollType, meat, false, false, false, false);


        }

    public String getAddon1DeluxeName() {
        return addon1DeluxeName;
    }

    public String getAddon2DeluxeName() {
            return addon2DeluxeName;
    }

    public double getAddonsDeluxePrice() {
        return addonsDeluxePrice;
    }

    @Override
    public double getHamburgerTotalPrice() {
        return (this.getHamburgerBasePrice() + this.getAddonsDeluxePrice());
    }

}

