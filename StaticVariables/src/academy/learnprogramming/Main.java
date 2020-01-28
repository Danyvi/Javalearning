package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dog rex = new Dog("Rex"); // create an instance (rex)

        Dog fluffy = new Dog("Fluffy"); // create an instance (fluffy)

        // once we call the constructor it will modify the variable "name" so
        // name = "Rex" becomes name = "Fluffy"!!!!!

        rex.printName(); // print fluffy

        fluffy.printName(); // print fluffy
    }
}


// static variables are shared between instances
// once we change the static variables all the instances will see that