package academy.learnprogramming;

class Car {
    // Fields
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    // Constructor
    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() -> Starting Engine..");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() -> Increase of speed ");
    }

    public void brake() {
        System.out.println("Car.brake() -> Decrease of speed ");
    }

}


class Tesla extends Car {

    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla.startEngine() -> The Tesla is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla.accelerate() -> The Tesla is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Tesla.brake() -> The Tesla is braking");
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi.startEngine() -> The Mitsubishi is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi.accelerate() -> The Mitsubishi is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi.brake() -> The Mitsubishi is braking");
    }
}



public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Tesla tesla = new Tesla("Model 3", 12);
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        Mitsubishi mitsubishi = new Mitsubishi("Outlander", 6);
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();


    }
}

