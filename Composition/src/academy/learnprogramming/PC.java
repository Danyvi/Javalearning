package academy.learnprogramming;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}


// This is composition:
// we created a class called PC.
// It has a case -> theCase variable
// It has a monitor -> a field called monitor
// It has a motherboard -> a field called motherboard

// we can see the advantages compared to inheritance:
// with inheritance we can only inherit from one class at a time (extends only from one class)

// In this case, what we have said is, the PC comprises of these three other classes
// (case, monitor and motherboard)

// The PC is going to have the objects that we create based off this class:
// we'll have an object case, monitor and motherboard in each instance that we create