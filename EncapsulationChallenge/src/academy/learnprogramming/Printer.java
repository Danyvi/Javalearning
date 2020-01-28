package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel,  boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.numberPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
//        System.out.println("This printer have printed a total of " + numberPagesPrinted + " pages");
        return numberPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int fillUpToner(int percFilled) {

        if (percFilled > 0 && percFilled <100) {
            if (this.tonerLevel + percFilled > 100) {
                return -1;
            }
            this.tonerLevel += percFilled;
            return this.tonerLevel;
        } else {
            return -1;
        }

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberPagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }


}
