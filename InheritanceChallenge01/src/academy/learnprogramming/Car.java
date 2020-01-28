package academy.learnprogramming;

public class Car extends Vehicle {

    private int enginePower;
    private String drive;
    private int range;



    public Car(int wheels, double weight,
               double length, double width, double height,
               String color, boolean engine, String typeOfEngine,
               double acceleration, int seating, double maxCargo,
               int enginePower, String drive, int range) {

        super(4, weight, length, width, height, color,
                true, typeOfEngine, acceleration,
                seating, maxCargo );

        this.enginePower = enginePower;
        this.drive = drive;
        this.range = range;

    }

    public void changingGears() {
        System.out.println("Changing gears...Car.changingGears() called");
    }

}
