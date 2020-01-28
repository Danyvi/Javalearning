package academy.learnprogramming;

// INHERITANCE -> "The relationship" is: that Car is a Vehicle
// COMPOSITION -> "Has a relationship"

// A computer has a motherboard, a case and a monitor
// but the monitors are not computers in the same sense that
// a Car is a Vehicle, but a computer has a motherboard, has a case
// and has a monitor.
// That what composition is: is actually modeling parts, parts of the grater whole
// In this case we are gonna model the computer and
// we are gonna model the "has a relationship" with motherboard, case, monitor

public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);

        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
