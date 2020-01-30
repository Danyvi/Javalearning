package academy.learnprogramming;

public class HealthyBurger extends Hamburger{

    private String addon1HealthyName = "Onions";
    private String addon2HealthyName = "Mushrooms";
    private boolean isAddon1Healthy;
    private boolean isAddon2Healthy;
    private double addon1HealthyPrice = 0.11;
    private double addon2HealthyPrice = 0.99;
    private double addonsHealthyPrice;
//    private double healthyBurgerTotalPrice;


    public HealthyBurger(boolean isAddition1, boolean isAddition2,
                         boolean isAddition3, boolean isAddition4,
                         boolean isAddon1Healthy, boolean isAddon2Healthy) {

        super("Healthy burger", "Brown eye", "cow",
                isAddition1, isAddition2, isAddition3, isAddition4);

        this.isAddon1Healthy = isAddon1Healthy;
        this.isAddon2Healthy = isAddon2Healthy;
        this.addonsHealthyPrice = 0;
    }

    public String getAddon1HealthyName() {
        return addon1HealthyName;
    }

    public String getAddon2HealthyName() {
        return addon2HealthyName;
    }

    @Override
    public double getAdditionsPrice() {
        if (this.getIsAddition1()) {
            this.addonsHealthyPrice+=getAddition1Price();
        }
        if (this.getIsAddition2()) {
            this.addonsHealthyPrice+=getAddition2Price();
        }
        if (this.getIsAddition3()) {
            this.addonsHealthyPrice+=getAddition3Price();
        }
        if (this.getIsAddition4()) {
            this.addonsHealthyPrice+=getAddition4Price();
        }
        if (isAddon1Healthy) {
            this.addonsHealthyPrice+=addon1HealthyPrice;
        }
        if (isAddon2Healthy) {
            this.addonsHealthyPrice+=addon2HealthyPrice;
        }
//        System.out.println("Your additions price is: " + addonsHealthyPrice);
        return addonsHealthyPrice;
    }

    @Override
    public double getHamburgerTotalPrice() {
       return (this.getHamburgerBasePrice() + this.getAddonsHealthyPrice());
    }

    public double getAddonsHealthyPrice() {
        return addonsHealthyPrice;
    }


}
