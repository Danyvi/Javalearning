package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// create the object from the blueprint Car
        Car porsche = new Car(); // variable/field initialization
        Car ferrari = new Car();
        Car tesla = new Car();

        porsche.setModel("Carrera");

        System.out.println("Model is "+ porsche.getModel());

    }
}
