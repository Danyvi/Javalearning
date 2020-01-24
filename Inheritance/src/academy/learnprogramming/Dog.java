package academy.learnprogramming;

// if we want to inherit, or be able to access
// the STATE of behavior that's in that other class
// we use the "EXTENDS" keyword

public class Dog extends Animal {

    // -- CHARACTERISTICS RELATED ONLY TO THE DOG CLASS --
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // -- END OF CHARACTERISTICS RELATED ONLY TO THE DOG CLASS --


    // now we have to be sure that we have a
    // constructor for the Dog class that calls that other class (Animal)

    // what "super" means is to call
    // the constructor that is for the class that we're extending from
    // the super class is the one that is used with "extends" keyword
    // or inheriting from ("Animal" in this case)
    // This allows us to initialize the Animal class

    // in this way we initialize the base characteristics of an animal,
    // namely the name, brain, body, size and weight
    // in a constructor

    // -- BASE CHARACTERISTICS THAT WE DEFINED IN THE ANIMAL CLASS --
    // that are not specific to a dog
    // that is why we are extending from that class
    // DOG CONSTRUCTOR
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // INHERIT FROM ANIMAL CLASS, call the ANIMAL constructor
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // we can add more feature to this "Dog" class
    // things that are unique to a dog and not to the "Animal" class,
    // that represents the generic animal

    // we can assign extra STATE, EXTRA FIELDS and EXTRA BEHAVIOR (methods)
    // that are unique for the "Dog" class and are not necessarily
    // applicable for an animal

    // now we have to build ANOTHER CONSTRUCTOR to initialize
    // the characteristics only DOG related like
    // eyes, legs, tail, teeth, coat

    // this method is unique to DOG class (not to ANIMAL)
    private void chew() {
        System.out.println("Chewing...Dog.chew() called");
    }

    // We override a method that is in the SUPER CLASS that in this case is
    // the ANIMAL class and more precisely we override the method eat()
    // with one specific to DOG
    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating like a dog...Dog.eat() called");
        chew();
    }

    public void walk() {
        System.out.println("Walking...Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Running...Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Moving legs at "+ speed + " Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
