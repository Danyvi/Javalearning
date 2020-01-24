package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal name", 1, 1, 5,5);

        Dog dog = new Dog("Bobby", 8, 20,2,2,1,20,"long");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
