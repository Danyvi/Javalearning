package academy.learnprogramming;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private String addition1Name = "Lettuce";
    private String addition2Name = "Tomato";
    private String addition3Name = "Carrot";
    private String addition4Name = "Pickle";
    private boolean isAddition1;
    private boolean isAddition2;
    private boolean isAddition3;
    private boolean isAddition4;
    private double addition1Price = 0.10;
    private double addition2Price = 0.15;
    private double addition3Price = 0.35;
    private double addition4Price = 0.40;
    private double additionsPrice;
    private double hamburgerBasePrice;
//    private double hamburgerTotalPrice;

    public Hamburger(String name, String breadRollType, String meat, boolean isAddition1, boolean isAddition2,
                     boolean isAddition3, boolean isAddition4) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.hamburgerBasePrice = 2;
        this.isAddition1 = isAddition1;
        this.isAddition2 = isAddition2;
        this.isAddition3 = isAddition3;
        this.isAddition4 = isAddition4;
        this.additionsPrice = 0;
    }


    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getHamburgerBasePrice() {
        return hamburgerBasePrice;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public boolean getIsAddition1() {
        return isAddition1;
    }

    public boolean getIsAddition2() {
        return isAddition2;
    }

    public boolean getIsAddition3() {
        return isAddition3;
    }

    public boolean getIsAddition4() {
        return isAddition4;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }



    public double getAdditionsPrice() {
        if (isAddition1) {
            this.additionsPrice+=addition1Price;
        }
        if (isAddition2) {
            this.additionsPrice+=addition2Price;
        }
        if (isAddition3) {
            this.additionsPrice+=addition3Price;
        }
        if (isAddition4) {
            this.additionsPrice+=addition4Price;
        }
//        System.out.println("Your additions price is: " + additionsPrice);
        return additionsPrice;
    }


    public double getHamburgerTotalPrice() {
        return (hamburgerBasePrice+additionsPrice);
    }
}
