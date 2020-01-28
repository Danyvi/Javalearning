package academy.learnprogramming;

public class Vehicle {

    // State (Characteristics) of the Class Vehicle defined by the Fields:
    private int wheels;
    private double weight;
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean engine;
    private String typeOfEngine;
    private double acceleration;
    private int seating;
    private double maxCargo;



    // Constructor of Vehicle Class
    public Vehicle(int wheels, double weight,
                   double length, double width, double height,
                   String color, boolean engine, String typeOfEngine,
                   double acceleration, int seating, double maxCargo) {

        this.wheels = wheels;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.engine = engine;
        this.typeOfEngine = typeOfEngine;
        this.acceleration = acceleration;
        this.seating = seating;
        this.maxCargo = maxCargo;
    }


    // Behaviors of the Class Vehicle defined by the Methods:
    public void moving() {
        System.out.println("Vehicle Moving...Vehicle.moving() called!");
    }

    public void handSteering() {
        System.out.println("Vehicle Steering...Vehicle.handSteering() called");
    }

    public void increasingSpeed() {
        System.out.println("Increasing Speed...Vehicle.increasingSpeed() called");
    }

    public void decreasingSpeed() {
        System.out.println("Decreasing Speed... Vehicle.decreasingSpeed() called");
    }

}
