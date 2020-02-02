package academy.learnprogramming;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <=0)
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return this.hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage() {
        return calculateWage(0);
    }


}
