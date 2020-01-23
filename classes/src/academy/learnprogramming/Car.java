package academy.learnprogramming;

public class Car {
    // create local variables/fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setter method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // test for accepting only some valid models. Only then we allow to access our internal state
        if(validModel.equals("carrera") || validModel.equals("testarossa")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter method
    public String getModel() {
        return this.model;
    }
}
