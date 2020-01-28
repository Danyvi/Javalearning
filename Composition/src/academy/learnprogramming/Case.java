package academy.learnprogramming;

public class Case {
    private String model;
    private String manufactorer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufactorer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
