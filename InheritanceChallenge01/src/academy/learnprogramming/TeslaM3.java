package academy.learnprogramming;

public class TeslaM3 extends Car {

    private boolean autopilot;

    public TeslaM3(int wheels, double weight,
                   double length, double width, double height,
                   String color, boolean engine, String typeOfEngine,
                   double acceleration, int seating, double maxCargo,
                   int enginePower, String drive, int range,
                   boolean autopilot) {

        super(4, 1831, 4.7, 2.09, 1.45,
                "White",true, "EV",
                3.2, 5, 425,
                450, "AWD", 500);

        this.autopilot = autopilot;
    }

    public TeslaM3() {
        this();
    }

    public void selfDriving() {
        if (autopilot) {
            System.out.println("Self Driving...TeslaM3.selfDriving() called");
        } else {
            System.out.println("This car does not have an autopilot...TeslaM3.selfDriving() called");
        }
    }

}
