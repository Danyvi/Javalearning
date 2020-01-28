package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("2208", "Dell", "240", dimensions );

    // when we create the pc, it needs to know what the case is
    // think of that as putting a PC together

    // new Resolution(2540, 1440) created an instance of a class without using a variable
    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard); // we have created a PC by passing three objects to it

    // with inheritance we have seen that we can access a method from the super class,
    // but if I wanna draw something using the monitor how do I access this method from our PC? (drawPixelAt)
    // The PC has got getters but it hasn't any way to access that and we are not overriding a method or anything like that

    // One way of using it is
    // using the getter function from here
    // which is returning theMonitor, which is the class that has been already initialized,
    // the object which has been created in this class,
    // is returning that to the calling process
    // and from there we call the method drawPixelAt
    // which is from that object that is stored within the PC class itself
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");

    // likewise we could
        thePC.getMotherboard().loadProgram("OSX");

        thePC.getTheCase().pressPowerButton();

    // we are passing the created Case, Monitor and Motherboard to the constructor
    // that is like getting those items and putting them together which forms our PC
    // The PC HAS a case, HAS a motherboard and HAS a monitor

    // This is the way to think whether to use inheritance or composition
    // a case by itself isn't just a computer
    // a monitor isn't a computer
    // a motherboard isn't a computer
    // they are part of a computer but not actually the whole computer
    // which is why we are using the composition instead of inheritance here
}
}
