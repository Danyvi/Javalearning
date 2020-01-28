package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial page count = "+ printer.getNumberPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed were " + pagesPrinted + ". New total print count for printer = "+printer.getNumberPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed were " + pagesPrinted + ". New total print count for printer = "+printer.getNumberPagesPrinted());



    }
}
