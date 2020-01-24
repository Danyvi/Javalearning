package academy.learnprogramming;

public class Animal {

    //  STATE (characteristics, fields)
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // CONSTRUCTOR
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // BEHAVIORS (Methods)

    public void eat() {
        System.out.println("Eating...Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Moving at " + speed + "...Animal.move() called");
    }

    // GETTER

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
