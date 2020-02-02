package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();


        var employee1 = new Employee(10_000);
        Employee.printNumberOfEmployees();

        int wage = employee.calculateWage();
        int wage1 = employee1.calculateWage();

        System.out.println(wage);
        System.out.println(wage1);

//        var browser = new Browser();
//        browser.navigate("espn");


    }

}
